/*
 *  iCure Data Stack. Copyright (c) 2020 Taktik SA
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful, but
 *     WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public
 *     License along with this program.  If not, see
 *     <https://www.gnu.org/licenses/>.
 */

package org.taktik.icure.constants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public interface Permissions {
	public static enum Type {
		// 1
		AUTHENTICATE(0, true, new CriterionType[] { CriterionType.VIRTUALHOST }),
		// 2
		ADMIN(1, true, new CriterionType[] { CriterionType.VIRTUALHOST }),
        // 16
        PATIENT_VIEW(4, true, new CriterionType[] { CriterionType.VIRTUALHOST, CriterionType.CURRENT_USER }),
        // 32
        DATA_VIEW(5, true, new CriterionType[]{
                CriterionType.VIRTUALHOST,
                CriterionType.DATA_TYPE,
                CriterionType.CURRENT_USER,
                CriterionType.DATA_TYPE,
                CriterionType.PATIENT_STATUS}),
        // 64
        CONFIDENTIAL_DATA_VIEW(6, true, new CriterionType[] {
                CriterionType.VIRTUALHOST,
                CriterionType.DATA_TYPE,
                CriterionType.CURRENT_USER,
                CriterionType.DATA_TYPE,
                CriterionType.PATIENT_STATUS}),
		// 128
		DATA_CREATE(7, true, new CriterionType[] {
                CriterionType.VIRTUALHOST,
                CriterionType.DATA_TYPE,
                CriterionType.CURRENT_USER,
                CriterionType.DATA_TYPE,
                CriterionType.PATIENT_STATUS}),
		// 256
        DATA_EDIT(8, true, new CriterionType[] {
                CriterionType.VIRTUALHOST,
                CriterionType.DATA_TYPE,
                CriterionType.CURRENT_USER,
                CriterionType.DATA_TYPE,
                CriterionType.PATIENT_STATUS}),
		// 1024
        DATA_DELETE(9, true, new CriterionType[] {
                CriterionType.VIRTUALHOST,
                CriterionType.DATA_TYPE,
                CriterionType.CURRENT_USER,
                CriterionType.DATA_TYPE,
                CriterionType.PATIENT_STATUS}),
        // 2048
        PATIENT_CREATE(10, true, new CriterionType[] {
                CriterionType.VIRTUALHOST,
                CriterionType.DATA_TYPE,
                CriterionType.CURRENT_USER,
                CriterionType.DATA_TYPE,
                CriterionType.PATIENT_STATUS}),
		// 4096
		PATIENT_EDIT(11, true, new CriterionType[] {
                CriterionType.VIRTUALHOST,
                CriterionType.DATA_TYPE,
                CriterionType.CURRENT_USER,
                CriterionType.DATA_TYPE,
                CriterionType.PATIENT_STATUS}),
		// 8192
        PATIENT_MERGE(12, true, new CriterionType[] {
                CriterionType.VIRTUALHOST,
                CriterionType.DATA_TYPE,
                CriterionType.CURRENT_USER,
                CriterionType.DATA_TYPE,
                CriterionType.PATIENT_STATUS}),
		// 16384
        PATIENT_DELETE(13, true, new CriterionType[] {
                CriterionType.VIRTUALHOST,
                CriterionType.DATA_TYPE,
                CriterionType.CURRENT_USER,
                CriterionType.DATA_TYPE,
                CriterionType.PATIENT_STATUS});

		private int bitIndex;

		private boolean supportNoCriterion;
		private Set<CriterionType> supportedCriterionTypes;

		Type(int bitIndex, boolean supportNoCriterion, CriterionType[] supportedCriterionTypes) {
			this.bitIndex = bitIndex;
			this.supportNoCriterion = supportNoCriterion;
			this.supportedCriterionTypes = new HashSet<>(Arrays.asList(supportedCriterionTypes));
		}

		public int getBitValue() {
			return 1 << bitIndex;
		}

		public boolean isEnabled(int integer) {
			return (integer & getBitValue()) == getBitValue();
		}

		public boolean isNoCriterionSupported() {
			return supportNoCriterion;
		}

		public boolean isCriterionTypeSupported(CriterionType criterionType) {
			return supportedCriterionTypes.contains(criterionType);
		}
	}

	public static enum CriterionType {
		VIRTUALHOST,
		CURRENT_USER,
        DATA_TYPE,
        PATIENT_STATUS
	}

	public static enum CriterionTypeCurrentUser {
        DATA_CREATION_USER,
        DATA_MODIFICATION_USER,
        PATIENT_CREATION_USER,
        PATIENT_MODIFICATION_USER,
        PATIENT_REFERENCE_HC_USER,
        PATIENT_HC_TEAM_USER,
    }

    public static enum CriterionDataType {
        ADMINISTRATIVE,
        HEALTH,
        SENSITIVE,
        CONFIDENTIAL
    }

}

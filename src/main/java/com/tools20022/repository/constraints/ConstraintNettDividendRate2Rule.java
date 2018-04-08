/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * Only a single occurrence of NettDividendRate/Amount may be present.<br>
 * (MT 566 NVR C3).
 */
public class ConstraintNettDividendRate2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64
	 * CorporateActionRate64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate64> forCorporateActionRate64 = new MMConstraint<CorporateActionRate64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate64.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate64 obj) throws Exception {
			checkCorporateActionRate64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31
	 * CorporateActionRate31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate31> forCorporateActionRate31 = new MMConstraint<CorporateActionRate31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate31.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate31 obj) throws Exception {
			checkCorporateActionRate31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26
	 * CorporateActionRate26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate26> forCorporateActionRate26 = new MMConstraint<CorporateActionRate26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate26.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate26 obj) throws Exception {
			checkCorporateActionRate26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70
	 * CorporateActionRate70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule#forCorporateActionRate82
	 * ConstraintNettDividendRate2Rule.forCorporateActionRate82}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule#forCorporateActionRate46
	 * ConstraintNettDividendRate2Rule.forCorporateActionRate46}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate70> forCorporateActionRate70 = new MMConstraint<CorporateActionRate70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule.forCorporateActionRate82);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule.forCorporateActionRate46;
			owner_lazy = () -> CorporateActionRate70.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate70 obj) throws Exception {
			checkCorporateActionRate70(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46
	 * CorporateActionRate46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule#forCorporateActionRate70
	 * ConstraintNettDividendRate2Rule.forCorporateActionRate70}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule#forCorporateActionRate38
	 * ConstraintNettDividendRate2Rule.forCorporateActionRate38}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate46> forCorporateActionRate46 = new MMConstraint<CorporateActionRate46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule.forCorporateActionRate70);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule.forCorporateActionRate38;
			owner_lazy = () -> CorporateActionRate46.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate46 obj) throws Exception {
			checkCorporateActionRate46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38
	 * CorporateActionRate38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule#forCorporateActionRate46
	 * ConstraintNettDividendRate2Rule.forCorporateActionRate46}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate38> forCorporateActionRate38 = new MMConstraint<CorporateActionRate38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule.forCorporateActionRate46);
			owner_lazy = () -> CorporateActionRate38.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate38 obj) throws Exception {
			checkCorporateActionRate38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74
	 * CorporateActionRate74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate74> forCorporateActionRate74 = new MMConstraint<CorporateActionRate74>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate74.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate74 obj) throws Exception {
			checkCorporateActionRate74(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85
	 * CorporateActionRate85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate85> forCorporateActionRate85 = new MMConstraint<CorporateActionRate85>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate85.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate85 obj) throws Exception {
			checkCorporateActionRate85(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82
	 * CorporateActionRate82}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule#forCorporateActionRate88
	 * ConstraintNettDividendRate2Rule.forCorporateActionRate88}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule#forCorporateActionRate70
	 * ConstraintNettDividendRate2Rule.forCorporateActionRate70}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate82> forCorporateActionRate82 = new MMConstraint<CorporateActionRate82>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule.forCorporateActionRate88);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule.forCorporateActionRate70;
			owner_lazy = () -> CorporateActionRate82.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate82 obj) throws Exception {
			checkCorporateActionRate82(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88
	 * CorporateActionRate88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule#forCorporateActionRate82
	 * ConstraintNettDividendRate2Rule.forCorporateActionRate82}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate88> forCorporateActionRate88 = new MMConstraint<CorporateActionRate88>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNettDividendRate2Rule.forCorporateActionRate82;
			owner_lazy = () -> CorporateActionRate88.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate88 obj) throws Exception {
			checkCorporateActionRate88(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39
	 * CorporateActionRate39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate39> forCorporateActionRate39 = new MMConstraint<CorporateActionRate39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of NettDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate39.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate39 obj) throws Exception {
			checkCorporateActionRate39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate92
	 * CorporateActionRate92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate92> forCorporateActionRate92 = new MMConstraint<CorporateActionRate92>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate92.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate92 obj) throws Exception {
			checkCorporateActionRate92(obj);
		}
	};

	/**
	 * Only a single occurrence of NettDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate64(CorporateActionRate64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NettDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate31(CorporateActionRate31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NettDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate26(CorporateActionRate26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate70(CorporateActionRate70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NettDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate46(CorporateActionRate46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NettDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate38(CorporateActionRate38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate74(CorporateActionRate74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate85(CorporateActionRate85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate82(CorporateActionRate82 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate88(CorporateActionRate88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NettDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate39(CorporateActionRate39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate92(CorporateActionRate92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
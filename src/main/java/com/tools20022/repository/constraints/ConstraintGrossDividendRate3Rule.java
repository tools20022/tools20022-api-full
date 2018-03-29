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
 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
 * (MT 566 NVR C3).
 */
public class ConstraintGrossDividendRate3Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20
	 * CorporateActionRate20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate20> forCorporateActionRate20 = new MMConstraint<CorporateActionRate20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate20.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate20 obj) throws Exception {
			checkCorporateActionRate20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails2> forRateDetails2 = new MMConstraint<RateDetails2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails2.mmObject();
		}

		@Override
		public void executeValidator(RateDetails2 obj) throws Exception {
			checkRateDetails2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22
	 * CorporateActionRate22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate22> forCorporateActionRate22 = new MMConstraint<CorporateActionRate22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate22.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate22 obj) throws Exception {
			checkCorporateActionRate22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails4 RateDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails4> forRateDetails4 = new MMConstraint<RateDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails4.mmObject();
		}

		@Override
		public void executeValidator(RateDetails4 obj) throws Exception {
			checkRateDetails4(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate26> forCorporateActionRate26 = new MMConstraint<CorporateActionRate26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails7 RateDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails7> forRateDetails7 = new MMConstraint<RateDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails7.mmObject();
		}

		@Override
		public void executeValidator(RateDetails7 obj) throws Exception {
			checkRateDetails7(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate31> forCorporateActionRate31 = new MMConstraint<CorporateActionRate31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails9 RateDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails9> forRateDetails9 = new MMConstraint<RateDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails9.mmObject();
		}

		@Override
		public void executeValidator(RateDetails9 obj) throws Exception {
			checkRateDetails9(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate46
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate46}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate38> forCorporateActionRate38 = new MMConstraint<CorporateActionRate38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate46);
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails11 RateDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails15
	 * ConstraintGrossDividendRate3Rule.forRateDetails15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails11> forRateDetails11 = new MMConstraint<RateDetails11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails15);
			owner_lazy = () -> RateDetails11.mmObject();
		}

		@Override
		public void executeValidator(RateDetails11 obj) throws Exception {
			checkRateDetails11(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate39> forCorporateActionRate39 = new MMConstraint<CorporateActionRate39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails12 RateDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails12> forRateDetails12 = new MMConstraint<RateDetails12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails12.mmObject();
		}

		@Override
		public void executeValidator(RateDetails12 obj) throws Exception {
			checkRateDetails12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15
	 * CorporateActionRate15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate15> forCorporateActionRate15 = new MMConstraint<CorporateActionRate15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate15.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate15 obj) throws Exception {
			checkCorporateActionRate15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails3 RateDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails3> forRateDetails3 = new MMConstraint<RateDetails3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails3.mmObject();
		}

		@Override
		public void executeValidator(RateDetails3 obj) throws Exception {
			checkRateDetails3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18
	 * CorporateActionRate18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate18> forCorporateActionRate18 = new MMConstraint<CorporateActionRate18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate18.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate18 obj) throws Exception {
			checkCorporateActionRate18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails5 RateDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails5> forRateDetails5 = new MMConstraint<RateDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails5.mmObject();
		}

		@Override
		public void executeValidator(RateDetails5 obj) throws Exception {
			checkRateDetails5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25
	 * CorporateActionRate25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate25> forCorporateActionRate25 = new MMConstraint<CorporateActionRate25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate25.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate25 obj) throws Exception {
			checkCorporateActionRate25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30
	 * CorporateActionRate30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate30> forCorporateActionRate30 = new MMConstraint<CorporateActionRate30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate30.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate30 obj) throws Exception {
			checkCorporateActionRate30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37
	 * CorporateActionRate37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate45
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate45}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate37> forCorporateActionRate37 = new MMConstraint<CorporateActionRate37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate45);
			owner_lazy = () -> CorporateActionRate37.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate37 obj) throws Exception {
			checkCorporateActionRate37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10 RateDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails14
	 * ConstraintGrossDividendRate3Rule.forRateDetails14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails10> forRateDetails10 = new MMConstraint<RateDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails14);
			owner_lazy = () -> RateDetails10.mmObject();
		}

		@Override
		public void executeValidator(RateDetails10 obj) throws Exception {
			checkRateDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40
	 * CorporateActionRate40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate40> forCorporateActionRate40 = new MMConstraint<CorporateActionRate40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate40.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate40 obj) throws Exception {
			checkCorporateActionRate40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails13 RateDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails13> forRateDetails13 = new MMConstraint<RateDetails13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails13.mmObject();
		}

		@Override
		public void executeValidator(RateDetails13 obj) throws Exception {
			checkRateDetails13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36
	 * CorporateActionRate36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate44
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate44}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate36> forCorporateActionRate36 = new MMConstraint<CorporateActionRate36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate44);
			owner_lazy = () -> CorporateActionRate36.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate36 obj) throws Exception {
			checkCorporateActionRate36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42
	 * CorporateActionRate42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate42> forCorporateActionRate42 = new MMConstraint<CorporateActionRate42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate42.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate42 obj) throws Exception {
			checkCorporateActionRate42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails15 RateDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails23
	 * ConstraintGrossDividendRate3Rule.forRateDetails23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails11
	 * ConstraintGrossDividendRate3Rule.forRateDetails11}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails15> forRateDetails15 = new MMConstraint<RateDetails15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails11;
			owner_lazy = () -> RateDetails15.mmObject();
		}

		@Override
		public void executeValidator(RateDetails15 obj) throws Exception {
			checkRateDetails15(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate70
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate70}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate38
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate38}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate46> forCorporateActionRate46 = new MMConstraint<CorporateActionRate46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate70);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate38;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45
	 * CorporateActionRate45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate67
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate67}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate37
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate37}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate45> forCorporateActionRate45 = new MMConstraint<CorporateActionRate45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate37;
			owner_lazy = () -> CorporateActionRate45.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate45 obj) throws Exception {
			checkCorporateActionRate45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44
	 * CorporateActionRate44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate68
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate36
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate36}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate44> forCorporateActionRate44 = new MMConstraint<CorporateActionRate44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate36;
			owner_lazy = () -> CorporateActionRate44.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate44 obj) throws Exception {
			checkCorporateActionRate44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails22
	 * ConstraintGrossDividendRate3Rule.forRateDetails22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails10
	 * ConstraintGrossDividendRate3Rule.forRateDetails10}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails14> forRateDetails14 = new MMConstraint<RateDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails10;
			owner_lazy = () -> RateDetails14.mmObject();
		}

		@Override
		public void executeValidator(RateDetails14 obj) throws Exception {
			checkRateDetails14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60
	 * CorporateActionRate60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate60> forCorporateActionRate60 = new MMConstraint<CorporateActionRate60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate60.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate60 obj) throws Exception {
			checkCorporateActionRate60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails18 RateDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails18> forRateDetails18 = new MMConstraint<RateDetails18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails18.mmObject();
		}

		@Override
		public void executeValidator(RateDetails18 obj) throws Exception {
			checkRateDetails18(obj);
		}
	};
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate64> forCorporateActionRate64 = new MMConstraint<CorporateActionRate64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails21 RateDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails21> forRateDetails21 = new MMConstraint<RateDetails21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails21.mmObject();
		}

		@Override
		public void executeValidator(RateDetails21 obj) throws Exception {
			checkRateDetails21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57
	 * CorporateActionRate57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate57> forCorporateActionRate57 = new MMConstraint<CorporateActionRate57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate57.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate57 obj) throws Exception {
			checkCorporateActionRate57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails23 RateDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails27
	 * ConstraintGrossDividendRate3Rule.forRateDetails27}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails15
	 * ConstraintGrossDividendRate3Rule.forRateDetails15}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails23> forRateDetails23 = new MMConstraint<RateDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails27);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails15;
			owner_lazy = () -> RateDetails23.mmObject();
		}

		@Override
		public void executeValidator(RateDetails23 obj) throws Exception {
			checkRateDetails23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68
	 * CorporateActionRate68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate80
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate80}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate44
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate44}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate68> forCorporateActionRate68 = new MMConstraint<CorporateActionRate68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate80);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate44;
			owner_lazy = () -> CorporateActionRate68.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate68 obj) throws Exception {
			checkCorporateActionRate68(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate82
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate82}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate46
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate46}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate70> forCorporateActionRate70 = new MMConstraint<CorporateActionRate70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate82);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate46;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67
	 * CorporateActionRate67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate81
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate81}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate45
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate45}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate67> forCorporateActionRate67 = new MMConstraint<CorporateActionRate67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate81);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate45;
			owner_lazy = () -> CorporateActionRate67.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate67 obj) throws Exception {
			checkCorporateActionRate67(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails22 RateDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails26
	 * ConstraintGrossDividendRate3Rule.forRateDetails26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails14
	 * ConstraintGrossDividendRate3Rule.forRateDetails14}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails22> forRateDetails22 = new MMConstraint<RateDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails14;
			owner_lazy = () -> RateDetails22.mmObject();
		}

		@Override
		public void executeValidator(RateDetails22 obj) throws Exception {
			checkRateDetails22(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate74> forCorporateActionRate74 = new MMConstraint<CorporateActionRate74>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79
	 * CorporateActionRate79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate79> forCorporateActionRate79 = new MMConstraint<CorporateActionRate79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate79.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate79 obj) throws Exception {
			checkCorporateActionRate79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails24 RateDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails24> forRateDetails24 = new MMConstraint<RateDetails24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			owner_lazy = () -> RateDetails24.mmObject();
		}

		@Override
		public void executeValidator(RateDetails24 obj) throws Exception {
			checkRateDetails24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails25 RateDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails25> forRateDetails25 = new MMConstraint<RateDetails25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7).";
			owner_lazy = () -> RateDetails25.mmObject();
		}

		@Override
		public void executeValidator(RateDetails25 obj) throws Exception {
			checkRateDetails25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76
	 * CorporateActionRate76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate76> forCorporateActionRate76 = new MMConstraint<CorporateActionRate76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate76.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate76 obj) throws Exception {
			checkCorporateActionRate76(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails26 RateDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails31
	 * ConstraintGrossDividendRate3Rule.forRateDetails31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails22
	 * ConstraintGrossDividendRate3Rule.forRateDetails22}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails26> forRateDetails26 = new MMConstraint<RateDetails26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails22;
			owner_lazy = () -> RateDetails26.mmObject();
		}

		@Override
		public void executeValidator(RateDetails26 obj) throws Exception {
			checkRateDetails26(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate88
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate88}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate70
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate70}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate82> forCorporateActionRate82 = new MMConstraint<CorporateActionRate82>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate88);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate70;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80
	 * CorporateActionRate80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate87
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate87}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate68
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate68}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate80> forCorporateActionRate80 = new MMConstraint<CorporateActionRate80>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate87);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate68;
			owner_lazy = () -> CorporateActionRate80.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate80 obj) throws Exception {
			checkCorporateActionRate80(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails27 RateDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails32
	 * ConstraintGrossDividendRate3Rule.forRateDetails32}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails23
	 * ConstraintGrossDividendRate3Rule.forRateDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails27> forRateDetails27 = new MMConstraint<RateDetails27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails32);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails23;
			owner_lazy = () -> RateDetails27.mmObject();
		}

		@Override
		public void executeValidator(RateDetails27 obj) throws Exception {
			checkRateDetails27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate86
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate86}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate67
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate67}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate81> forCorporateActionRate81 = new MMConstraint<CorporateActionRate81>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate86);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate67;
			owner_lazy = () -> CorporateActionRate81.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate81 obj) throws Exception {
			checkCorporateActionRate81(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83
	 * CorporateActionRate83}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate83> forCorporateActionRate83 = new MMConstraint<CorporateActionRate83>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate83.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate83 obj) throws Exception {
			checkCorporateActionRate83(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84
	 * CorporateActionRate84}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate84> forCorporateActionRate84 = new MMConstraint<CorporateActionRate84>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate84.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate84 obj) throws Exception {
			checkCorporateActionRate84(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate85> forCorporateActionRate85 = new MMConstraint<CorporateActionRate85>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails28> forRateDetails28 = new MMConstraint<RateDetails28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7).";
			owner_lazy = () -> RateDetails28.mmObject();
		}

		@Override
		public void executeValidator(RateDetails28 obj) throws Exception {
			checkRateDetails28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails30 RateDetails30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails30> forRateDetails30 = new MMConstraint<RateDetails30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			owner_lazy = () -> RateDetails30.mmObject();
		}

		@Override
		public void executeValidator(RateDetails30 obj) throws Exception {
			checkRateDetails30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails26
	 * ConstraintGrossDividendRate3Rule.forRateDetails26}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails31> forRateDetails31 = new MMConstraint<RateDetails31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present.\r\n(MT 564 NVR C7).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails26;
			owner_lazy = () -> RateDetails31.mmObject();
		}

		@Override
		public void executeValidator(RateDetails31 obj) throws Exception {
			checkRateDetails31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86
	 * CorporateActionRate86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of these elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate81
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate81}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate86> forCorporateActionRate86 = new MMConstraint<CorporateActionRate86>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of these elements may be present. (MT 564 NVR C7).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate81;
			owner_lazy = () -> CorporateActionRate86.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate86 obj) throws Exception {
			checkCorporateActionRate86(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails27
	 * ConstraintGrossDividendRate3Rule.forRateDetails27}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails32> forRateDetails32 = new MMConstraint<RateDetails32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails27;
			owner_lazy = () -> RateDetails32.mmObject();
		}

		@Override
		public void executeValidator(RateDetails32 obj) throws Exception {
			checkRateDetails32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of these elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate80
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate80}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate87> forCorporateActionRate87 = new MMConstraint<CorporateActionRate87>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of these elements may be present. (MT 564 NVR C7).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate80;
			owner_lazy = () -> CorporateActionRate87.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate87 obj) throws Exception {
			checkCorporateActionRate87(obj);
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
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate82
	 * ConstraintGrossDividendRate3Rule.forCorporateActionRate82}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate88> forCorporateActionRate88 = new MMConstraint<CorporateActionRate88>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate82;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate92
	 * CorporateActionRate92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate92> forCorporateActionRate92 = new MMConstraint<CorporateActionRate92>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			owner_lazy = () -> CorporateActionRate92.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate92 obj) throws Exception {
			checkCorporateActionRate92(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails33 RateDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails33> forRateDetails33 = new MMConstraint<RateDetails33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3).";
			owner_lazy = () -> RateDetails33.mmObject();
		}

		@Override
		public void executeValidator(RateDetails33 obj) throws Exception {
			checkRateDetails33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate94
	 * CorporateActionRate94}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of these elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate94> forCorporateActionRate94 = new MMConstraint<CorporateActionRate94>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of these elements may be present. (MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate94.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate94 obj) throws Exception {
			checkCorporateActionRate94(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails34 RateDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails34> forRateDetails34 = new MMConstraint<RateDetails34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present.\r\n(MT 564 NVR C7).";
			owner_lazy = () -> RateDetails34.mmObject();
		}

		@Override
		public void executeValidator(RateDetails34 obj) throws Exception {
			checkRateDetails34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate97
	 * CorporateActionRate97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of these elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate97> forCorporateActionRate97 = new MMConstraint<CorporateActionRate97>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of these elements may be present. (MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate97.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate97 obj) throws Exception {
			checkCorporateActionRate97(obj);
		}
	};

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate20(CorporateActionRate20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails2(RateDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate22(CorporateActionRate22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails4(RateDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate26(CorporateActionRate26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails7(RateDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate31(CorporateActionRate31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails9(RateDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate38(CorporateActionRate38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails11(RateDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate39(CorporateActionRate39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails12(RateDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate15(CorporateActionRate15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails3(RateDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate18(CorporateActionRate18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails5(RateDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate25(CorporateActionRate25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate30(CorporateActionRate30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate37(CorporateActionRate37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails10(RateDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate40(CorporateActionRate40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails13(RateDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate36(CorporateActionRate36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate42(CorporateActionRate42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails15(RateDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate46(CorporateActionRate46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate45(CorporateActionRate45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate44(CorporateActionRate44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails14(RateDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate60(CorporateActionRate60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails18(RateDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate64(CorporateActionRate64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails21(RateDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate57(CorporateActionRate57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails23(RateDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate68(CorporateActionRate68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate70(CorporateActionRate70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate67(CorporateActionRate67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of those
	 * elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails22(RateDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate74(CorporateActionRate74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate79(CorporateActionRate79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails24(RateDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of those
	 * elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails25(RateDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate76(CorporateActionRate76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of those
	 * elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails26(RateDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate82(CorporateActionRate82 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate80(CorporateActionRate80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails27(RateDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate81(CorporateActionRate81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate83(CorporateActionRate83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate84(CorporateActionRate84 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate85(CorporateActionRate85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of those
	 * elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails28(RateDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails30(RateDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of these
	 * elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails31(RateDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of these
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate86(CorporateActionRate86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails32(RateDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of these
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate87(CorporateActionRate87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate88(CorporateActionRate88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkCorporateActionRate92(CorporateActionRate92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails33(RateDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of these
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate94(CorporateActionRate94 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of these
	 * elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails34(RateDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of these
	 * elements may be present. (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate97(CorporateActionRate97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
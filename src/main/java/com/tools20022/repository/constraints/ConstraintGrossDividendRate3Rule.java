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
 * (MT 566 NVR C3)
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate20> forCorporateActionRate20 = new MMConstraint<CorporateActionRate20>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> CorporateActionRate20.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails2> forRateDetails2 = new MMConstraint<RateDetails2>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> RateDetails2.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate22> forCorporateActionRate22 = new MMConstraint<CorporateActionRate22>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> CorporateActionRate22.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails4> forRateDetails4 = new MMConstraint<RateDetails4>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> RateDetails4.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate26> forCorporateActionRate26 = new MMConstraint<CorporateActionRate26>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> CorporateActionRate26.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails7> forRateDetails7 = new MMConstraint<RateDetails7>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> RateDetails7.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate31> forCorporateActionRate31 = new MMConstraint<CorporateActionRate31>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> CorporateActionRate31.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails9> forRateDetails9 = new MMConstraint<RateDetails9>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> RateDetails9.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate46);
			owner_lazy = () -> CorporateActionRate38.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
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
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails15);
			owner_lazy = () -> RateDetails11.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate39> forCorporateActionRate39 = new MMConstraint<CorporateActionRate39>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> CorporateActionRate39.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails12> forRateDetails12 = new MMConstraint<RateDetails12>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> RateDetails12.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate15> forCorporateActionRate15 = new MMConstraint<CorporateActionRate15>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> CorporateActionRate15.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails3> forRateDetails3 = new MMConstraint<RateDetails3>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> RateDetails3.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate18> forCorporateActionRate18 = new MMConstraint<CorporateActionRate18>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> CorporateActionRate18.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails5> forRateDetails5 = new MMConstraint<RateDetails5>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> RateDetails5.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate25> forCorporateActionRate25 = new MMConstraint<CorporateActionRate25>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> CorporateActionRate25.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate30> forCorporateActionRate30 = new MMConstraint<CorporateActionRate30>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> CorporateActionRate30.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate45);
			owner_lazy = () -> CorporateActionRate37.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
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
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails14);
			owner_lazy = () -> RateDetails10.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate40> forCorporateActionRate40 = new MMConstraint<CorporateActionRate40>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> CorporateActionRate40.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails13> forRateDetails13 = new MMConstraint<RateDetails13>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> RateDetails13.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate44);
			owner_lazy = () -> CorporateActionRate36.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate42> forCorporateActionRate42 = new MMConstraint<CorporateActionRate42>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> CorporateActionRate42.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
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
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails11;
			owner_lazy = () -> RateDetails15.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate70);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate38;
			owner_lazy = () -> CorporateActionRate46.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate37;
			owner_lazy = () -> CorporateActionRate45.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate36;
			owner_lazy = () -> CorporateActionRate44.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
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
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails10;
			owner_lazy = () -> RateDetails14.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate60> forCorporateActionRate60 = new MMConstraint<CorporateActionRate60>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> CorporateActionRate60.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails18> forRateDetails18 = new MMConstraint<RateDetails18>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> RateDetails18.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate64> forCorporateActionRate64 = new MMConstraint<CorporateActionRate64>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate64;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> CorporateActionRate64.mmObject();
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
	 * "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails21> forRateDetails21 = new MMConstraint<RateDetails21>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of GrossDividendRate/Amount may be present.\r\n(MT 566 NVR C3)";
			owner_lazy = () -> RateDetails21.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate57> forCorporateActionRate57 = new MMConstraint<CorporateActionRate57>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)";
			owner_lazy = () -> CorporateActionRate57.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)"
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
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails27);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails15;
			owner_lazy = () -> RateDetails23.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate80);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate44;
			owner_lazy = () -> CorporateActionRate68.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate82);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate46;
			owner_lazy = () -> CorporateActionRate70.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate81);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate45;
			owner_lazy = () -> CorporateActionRate67.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)"
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
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails14;
			owner_lazy = () -> RateDetails22.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate74> forCorporateActionRate74 = new MMConstraint<CorporateActionRate74>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate74;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)";
			owner_lazy = () -> CorporateActionRate74.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate79> forCorporateActionRate79 = new MMConstraint<CorporateActionRate79>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)";
			owner_lazy = () -> CorporateActionRate79.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails24> forRateDetails24 = new MMConstraint<RateDetails24>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)";
			owner_lazy = () -> RateDetails24.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails25> forRateDetails25 = new MMConstraint<RateDetails25>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)";
			owner_lazy = () -> RateDetails25.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate76> forCorporateActionRate76 = new MMConstraint<CorporateActionRate76>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate76;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)";
			owner_lazy = () -> CorporateActionRate76.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)"
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
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails22;
			owner_lazy = () -> RateDetails26.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate82;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate70;
			owner_lazy = () -> CorporateActionRate82.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate80;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate68;
			owner_lazy = () -> CorporateActionRate80.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)"
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
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails23;
			owner_lazy = () -> RateDetails27.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)"
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
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate81;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate67;
			owner_lazy = () -> CorporateActionRate81.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate83> forCorporateActionRate83 = new MMConstraint<CorporateActionRate83>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate83;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)";
			owner_lazy = () -> CorporateActionRate83.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate84> forCorporateActionRate84 = new MMConstraint<CorporateActionRate84>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate84;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, only one of those elements may be present. (MT 564 NVR C7)";
			owner_lazy = () -> CorporateActionRate84.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate85> forCorporateActionRate85 = new MMConstraint<CorporateActionRate85>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkCorporateActionRate85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)";
			owner_lazy = () -> CorporateActionRate85.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails28> forRateDetails28 = new MMConstraint<RateDetails28>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus or GrossDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)";
			owner_lazy = () -> RateDetails28.mmObject();
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
	 * "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails30> forRateDetails30 = new MMConstraint<RateDetails30>() {
		{
			validator = ConstraintGrossDividendRate3Rule::checkRateDetails30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate3Rule";
			definition = "Only a single occurrence of either GrossDividendRate/Amount or GrossDividendRate/AmountAndRateStatus may be present. Both elements may not be present together. (MT 566 NVR C3)";
			owner_lazy = () -> RateDetails30.mmObject();
		}
	};

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate20(CorporateActionRate20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkRateDetails2(RateDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate22(CorporateActionRate22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkRateDetails4(RateDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate26(CorporateActionRate26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkRateDetails7(RateDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate31(CorporateActionRate31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkRateDetails9(RateDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate38(CorporateActionRate38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkRateDetails11(RateDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate39(CorporateActionRate39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkRateDetails12(RateDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate15(CorporateActionRate15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkRateDetails3(RateDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate18(CorporateActionRate18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkRateDetails5(RateDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate25(CorporateActionRate25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate30(CorporateActionRate30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate37(CorporateActionRate37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkRateDetails10(RateDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate40(CorporateActionRate40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkRateDetails13(RateDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate36(CorporateActionRate36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate42(CorporateActionRate42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkRateDetails15(RateDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate46(CorporateActionRate46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate45(CorporateActionRate45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate44(CorporateActionRate44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkRateDetails14(RateDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate60(CorporateActionRate60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkRateDetails18(RateDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate64(CorporateActionRate64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of GrossDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3)
	 */
	public static void checkRateDetails21(RateDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together.<br>
	 * (MT 564 NVR C8)
	 */
	public static void checkCorporateActionRate57(CorporateActionRate57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3)
	 */
	public static void checkRateDetails23(RateDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7)
	 */
	public static void checkCorporateActionRate68(CorporateActionRate68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate70(CorporateActionRate70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7)
	 */
	public static void checkCorporateActionRate67(CorporateActionRate67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of those
	 * elements may be present.<br>
	 * (MT 564 NVR C7)
	 */
	public static void checkRateDetails22(RateDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate74(CorporateActionRate74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7)
	 */
	public static void checkCorporateActionRate79(CorporateActionRate79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3)
	 */
	public static void checkRateDetails24(RateDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of those
	 * elements may be present.<br>
	 * (MT 564 NVR C7)
	 */
	public static void checkRateDetails25(RateDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7)
	 */
	public static void checkCorporateActionRate76(CorporateActionRate76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of those
	 * elements may be present.<br>
	 * (MT 564 NVR C7)
	 */
	public static void checkRateDetails26(RateDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate82(CorporateActionRate82 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7)
	 */
	public static void checkCorporateActionRate80(CorporateActionRate80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3)
	 */
	public static void checkRateDetails27(RateDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7)
	 */
	public static void checkCorporateActionRate81(CorporateActionRate81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7)
	 */
	public static void checkCorporateActionRate83(CorporateActionRate83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, only one of those
	 * elements may be present. (MT 564 NVR C7)
	 */
	public static void checkCorporateActionRate84(CorporateActionRate84 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3)
	 */
	public static void checkCorporateActionRate85(CorporateActionRate85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus or
	 * GrossDividendRate/NotSpecifiedRate may be present, and only one of those
	 * elements may be present.<br>
	 * (MT 564 NVR C7)
	 */
	public static void checkRateDetails28(RateDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either GrossDividendRate/Amount or
	 * GrossDividendRate/AmountAndRateStatus may be present. Both elements may
	 * not be present together. (MT 566 NVR C3)
	 */
	public static void checkRateDetails30(RateDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
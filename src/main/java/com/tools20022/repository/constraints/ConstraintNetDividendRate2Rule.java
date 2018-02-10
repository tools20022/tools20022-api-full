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
 * Only a single occurrence of NetDividendRate/Amount may be present.<br>
 * (MT 566 NVR C3).
 */
public class ConstraintNetDividendRate2Rule {

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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails2> forRateDetails2 = new MMConstraint<RateDetails2>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails2.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails4> forRateDetails4 = new MMConstraint<RateDetails4>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails4.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails7> forRateDetails7 = new MMConstraint<RateDetails7>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails7.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails9> forRateDetails9 = new MMConstraint<RateDetails9>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails9.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails15
	 * ConstraintNetDividendRate2Rule.forRateDetails15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails11> forRateDetails11 = new MMConstraint<RateDetails11>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails15);
			owner_lazy = () -> RateDetails11.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails12> forRateDetails12 = new MMConstraint<RateDetails12>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails12.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails3> forRateDetails3 = new MMConstraint<RateDetails3>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails3.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails5> forRateDetails5 = new MMConstraint<RateDetails5>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate25> forCorporateActionRate25 = new MMConstraint<CorporateActionRate25>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate30> forCorporateActionRate30 = new MMConstraint<CorporateActionRate30>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate45
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate45}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate37> forCorporateActionRate37 = new MMConstraint<CorporateActionRate37>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate45);
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails14
	 * ConstraintNetDividendRate2Rule.forRateDetails14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails10> forRateDetails10 = new MMConstraint<RateDetails10>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails14);
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate40> forCorporateActionRate40 = new MMConstraint<CorporateActionRate40>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails13> forRateDetails13 = new MMConstraint<RateDetails13>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate44
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate44}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate36> forCorporateActionRate36 = new MMConstraint<CorporateActionRate36>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate44);
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate42> forCorporateActionRate42 = new MMConstraint<CorporateActionRate42>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails23
	 * ConstraintNetDividendRate2Rule.forRateDetails23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails11
	 * ConstraintNetDividendRate2Rule.forRateDetails11}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails15> forRateDetails15 = new MMConstraint<RateDetails15>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails11;
			owner_lazy = () -> RateDetails15.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate67
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate67}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate37
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate37}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate45> forCorporateActionRate45 = new MMConstraint<CorporateActionRate45>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate37;
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate68
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate36
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate36}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate44> forCorporateActionRate44 = new MMConstraint<CorporateActionRate44>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate36;
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails22
	 * ConstraintNetDividendRate2Rule.forRateDetails22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails10
	 * ConstraintNetDividendRate2Rule.forRateDetails10}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails14> forRateDetails14 = new MMConstraint<RateDetails14>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails10;
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate60> forCorporateActionRate60 = new MMConstraint<CorporateActionRate60>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails18> forRateDetails18 = new MMConstraint<RateDetails18>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/NotSpecifiedRate may be present, both elements may not be present together.\r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails18.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails21> forRateDetails21 = new MMConstraint<RateDetails21>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of NetDividendRate/Amount may be present.\r\n(MT 566 NVR C3).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate57> forCorporateActionRate57 = new MMConstraint<CorporateActionRate57>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NettDividendRate/Amount or NettDividendRate/NotSpecifiedRate may be present, both elements may not be present together. (MT 564 NVR C8).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails27
	 * ConstraintNetDividendRate2Rule.forRateDetails27}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails15
	 * ConstraintNetDividendRate2Rule.forRateDetails15}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails23> forRateDetails23 = new MMConstraint<RateDetails23>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails27);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails15;
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate80
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate80}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate44
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate44}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate68> forCorporateActionRate68 = new MMConstraint<CorporateActionRate68>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate80);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate44;
			owner_lazy = () -> CorporateActionRate68.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate81
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate81}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate45
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate45}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate67> forCorporateActionRate67 = new MMConstraint<CorporateActionRate67>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate81);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate45;
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails26
	 * ConstraintNetDividendRate2Rule.forRateDetails26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails14
	 * ConstraintNetDividendRate2Rule.forRateDetails14}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails22> forRateDetails22 = new MMConstraint<RateDetails22>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails14;
			owner_lazy = () -> RateDetails22.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate79> forCorporateActionRate79 = new MMConstraint<CorporateActionRate79>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails24> forRateDetails24 = new MMConstraint<RateDetails24>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails25> forRateDetails25 = new MMConstraint<RateDetails25>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate76> forCorporateActionRate76 = new MMConstraint<CorporateActionRate76>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate76;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails31
	 * ConstraintNetDividendRate2Rule.forRateDetails31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails22
	 * ConstraintNetDividendRate2Rule.forRateDetails22}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails26> forRateDetails26 = new MMConstraint<RateDetails26>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails22;
			owner_lazy = () -> RateDetails26.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate87
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate87}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate68
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate68}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate80> forCorporateActionRate80 = new MMConstraint<CorporateActionRate80>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate80;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate87);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate68;
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails32
	 * ConstraintNetDividendRate2Rule.forRateDetails32}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails23
	 * ConstraintNetDividendRate2Rule.forRateDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails27> forRateDetails27 = new MMConstraint<RateDetails27>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails32);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails23;
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate86
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate86}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate67
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate67}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate81> forCorporateActionRate81 = new MMConstraint<CorporateActionRate81>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate81;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate86);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate67;
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate83> forCorporateActionRate83 = new MMConstraint<CorporateActionRate83>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate83;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate84> forCorporateActionRate84 = new MMConstraint<CorporateActionRate84>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate84;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present. (MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate84.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails28> forRateDetails28 = new MMConstraint<RateDetails28>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of those elements may be present.\r\n(MT 564 NVR C7).";
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails30> forRateDetails30 = new MMConstraint<RateDetails30>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			owner_lazy = () -> RateDetails30.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails26
	 * ConstraintNetDividendRate2Rule.forRateDetails26}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails31> forRateDetails31 = new MMConstraint<RateDetails31>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present.\r\n(MT 564 NVR C7).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails26;
			owner_lazy = () -> RateDetails31.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate81
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate81}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate86> forCorporateActionRate86 = new MMConstraint<CorporateActionRate86>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate86;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present. (MT 564 NVR C7).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate81;
			owner_lazy = () -> CorporateActionRate86.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails27
	 * ConstraintNetDividendRate2Rule.forRateDetails27}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails32> forRateDetails32 = new MMConstraint<RateDetails32>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails27;
			owner_lazy = () -> RateDetails32.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate80
	 * ConstraintNetDividendRate2Rule.forCorporateActionRate80}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate87> forCorporateActionRate87 = new MMConstraint<CorporateActionRate87>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate87;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present. (MT 564 NVR C7).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate80;
			owner_lazy = () -> CorporateActionRate87.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails33> forRateDetails33 = new MMConstraint<RateDetails33>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount may be present. Both elements may not be present together. (MT 566 NVR C3).";
			owner_lazy = () -> RateDetails33.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate94> forCorporateActionRate94 = new MMConstraint<CorporateActionRate94>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate94;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present. (MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate94.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present.\r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails34> forRateDetails34 = new MMConstraint<RateDetails34>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkRateDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present.\r\n(MT 564 NVR C7).";
			owner_lazy = () -> RateDetails34.mmObject();
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
	 * name} = "NetDividendRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present. (MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate97> forCorporateActionRate97 = new MMConstraint<CorporateActionRate97>() {
		{
			validator = ConstraintNetDividendRate2Rule::checkCorporateActionRate97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate2Rule";
			definition = "Only a single occurrence of either NetDividendRate/Amount or NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate may be present, and only one of these elements may be present. (MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate97.mmObject();
		}
	};

	/**
	 * Only a single occurrence of NetDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails2(RateDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NetDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails4(RateDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NetDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails7(RateDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NetDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails9(RateDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NetDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails11(RateDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NetDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails12(RateDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/NotSpecifiedRate may be present, both elements may not be
	 * present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails3(RateDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/NotSpecifiedRate may be present, both elements may not be
	 * present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails5(RateDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate25(CorporateActionRate25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate30(CorporateActionRate30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate37(CorporateActionRate37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/NotSpecifiedRate may be present, both elements may not be
	 * present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails10(RateDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate40(CorporateActionRate40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/NotSpecifiedRate may be present, both elements may not be
	 * present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails13(RateDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate36(CorporateActionRate36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate42(CorporateActionRate42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NetDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails15(RateDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate45(CorporateActionRate45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate44(CorporateActionRate44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/NotSpecifiedRate may be present, both elements may not be
	 * present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails14(RateDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate60(CorporateActionRate60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/NotSpecifiedRate may be present, both elements may not be
	 * present together.<br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails18(RateDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of NetDividendRate/Amount may be present.<br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails21(RateDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NettDividendRate/Amount or
	 * NettDividendRate/NotSpecifiedRate may be present, both elements may not
	 * be present together. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate57(CorporateActionRate57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails23(RateDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate68(CorporateActionRate68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate67(CorporateActionRate67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails22(RateDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate79(CorporateActionRate79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails24(RateDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails25(RateDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate76(CorporateActionRate76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails26(RateDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate80(CorporateActionRate80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails27(RateDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate81(CorporateActionRate81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate83(CorporateActionRate83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate84(CorporateActionRate84 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of those elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails28(RateDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails30(RateDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of these elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails31(RateDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of these elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate86(CorporateActionRate86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails32(RateDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of these elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate87(CorporateActionRate87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount may be present.
	 * Both elements may not be present together. (MT 566 NVR C3).
	 */
	public static void checkRateDetails33(RateDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of these elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate94(CorporateActionRate94 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of these elements may be present.<br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails34(RateDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either NetDividendRate/Amount or
	 * NetDividendRate/AmountAndRateStatus or NetDividendRate/NotSpecifiedRate
	 * may be present, and only one of these elements may be present. (MT 564
	 * NVR C7).
	 */
	public static void checkCorporateActionRate97(CorporateActionRate97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
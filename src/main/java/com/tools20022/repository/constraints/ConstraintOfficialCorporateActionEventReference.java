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
 * The Securities Market Practice Group (SMPG) has published market practice
 * recommendations on the structure and usage of the Official Corporate Action
 * Event Reference (COAF). Those recommendations are<br>
 * available in the SMPG Global Market Practices Part 1 document on
 * www.smpg.info.
 */
public class ConstraintOfficialCorporateActionEventReference {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35
	 * CorporateActionGeneralInformation35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation35> forCorporateActionGeneralInformation35 = new MMConstraint<CorporateActionGeneralInformation35>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43
	 * CorporateActionGeneralInformation43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation43> forCorporateActionGeneralInformation43 = new MMConstraint<CorporateActionGeneralInformation43>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53
	 * CorporateActionGeneralInformation53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation87
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation87}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation53> forCorporateActionGeneralInformation53 = new MMConstraint<CorporateActionGeneralInformation53>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation87);
			owner_lazy = () -> CorporateActionGeneralInformation53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56
	 * CorporateActionGeneralInformation56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation86
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation86}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation56> forCorporateActionGeneralInformation56 = new MMConstraint<CorporateActionGeneralInformation56>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation86);
			owner_lazy = () -> CorporateActionGeneralInformation56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57
	 * CorporateActionGeneralInformation57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation57> forCorporateActionGeneralInformation57 = new MMConstraint<CorporateActionGeneralInformation57>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34
	 * CorporateActionGeneralInformation34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation34> forCorporateActionGeneralInformation34 = new MMConstraint<CorporateActionGeneralInformation34>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42
	 * CorporateActionGeneralInformation42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation42> forCorporateActionGeneralInformation42 = new MMConstraint<CorporateActionGeneralInformation42>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52
	 * CorporateActionGeneralInformation52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation91
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation91}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation52> forCorporateActionGeneralInformation52 = new MMConstraint<CorporateActionGeneralInformation52>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation91);
			owner_lazy = () -> CorporateActionGeneralInformation52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58
	 * CorporateActionGeneralInformation58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation58> forCorporateActionGeneralInformation58 = new MMConstraint<CorporateActionGeneralInformation58>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36
	 * CorporateActionGeneralInformation36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation36> forCorporateActionGeneralInformation36 = new MMConstraint<CorporateActionGeneralInformation36>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44
	 * CorporateActionGeneralInformation44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation44> forCorporateActionGeneralInformation44 = new MMConstraint<CorporateActionGeneralInformation44>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55
	 * CorporateActionGeneralInformation55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation71
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation71}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation55> forCorporateActionGeneralInformation55 = new MMConstraint<CorporateActionGeneralInformation55>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation71);
			owner_lazy = () -> CorporateActionGeneralInformation55.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61
	 * CorporateActionGeneralInformation61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation61> forCorporateActionGeneralInformation61 = new MMConstraint<CorporateActionGeneralInformation61>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation33
	 * CorporateActionGeneralInformation33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation33> forCorporateActionGeneralInformation33 = new MMConstraint<CorporateActionGeneralInformation33>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation41
	 * CorporateActionGeneralInformation41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation41> forCorporateActionGeneralInformation41 = new MMConstraint<CorporateActionGeneralInformation41>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation49
	 * CorporateActionGeneralInformation49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation90
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation90}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation49> forCorporateActionGeneralInformation49 = new MMConstraint<CorporateActionGeneralInformation49>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation90);
			owner_lazy = () -> CorporateActionGeneralInformation49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation68
	 * CorporateActionGeneralInformation68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation68> forCorporateActionGeneralInformation68 = new MMConstraint<CorporateActionGeneralInformation68>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39
	 * CorporateActionGeneralInformation39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation39> forCorporateActionGeneralInformation39 = new MMConstraint<CorporateActionGeneralInformation39>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47
	 * CorporateActionGeneralInformation47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation47> forCorporateActionGeneralInformation47 = new MMConstraint<CorporateActionGeneralInformation47>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50
	 * CorporateActionGeneralInformation50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation79
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation79}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation50> forCorporateActionGeneralInformation50 = new MMConstraint<CorporateActionGeneralInformation50>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation79);
			owner_lazy = () -> CorporateActionGeneralInformation50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62
	 * CorporateActionGeneralInformation62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation62> forCorporateActionGeneralInformation62 = new MMConstraint<CorporateActionGeneralInformation62>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38
	 * CorporateActionGeneralInformation38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation38> forCorporateActionGeneralInformation38 = new MMConstraint<CorporateActionGeneralInformation38>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46
	 * CorporateActionGeneralInformation46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation46> forCorporateActionGeneralInformation46 = new MMConstraint<CorporateActionGeneralInformation46>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation46.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54
	 * CorporateActionGeneralInformation54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation69
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation69}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation54> forCorporateActionGeneralInformation54 = new MMConstraint<CorporateActionGeneralInformation54>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation54;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation69);
			owner_lazy = () -> CorporateActionGeneralInformation54.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64
	 * CorporateActionGeneralInformation64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation64> forCorporateActionGeneralInformation64 = new MMConstraint<CorporateActionGeneralInformation64>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation64;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation64.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63
	 * CorporateActionGeneralInformation63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation63> forCorporateActionGeneralInformation63 = new MMConstraint<CorporateActionGeneralInformation63>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37
	 * CorporateActionGeneralInformation37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation37> forCorporateActionGeneralInformation37 = new MMConstraint<CorporateActionGeneralInformation37>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45
	 * CorporateActionGeneralInformation45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation45> forCorporateActionGeneralInformation45 = new MMConstraint<CorporateActionGeneralInformation45>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51
	 * CorporateActionGeneralInformation51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation70
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation70}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation51> forCorporateActionGeneralInformation51 = new MMConstraint<CorporateActionGeneralInformation51>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation70);
			owner_lazy = () -> CorporateActionGeneralInformation51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67
	 * CorporateActionGeneralInformation67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation67> forCorporateActionGeneralInformation67 = new MMConstraint<CorporateActionGeneralInformation67>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation40
	 * CorporateActionGeneralInformation40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation92
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation92}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation40> forCorporateActionGeneralInformation40 = new MMConstraint<CorporateActionGeneralInformation40>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation92);
			owner_lazy = () -> CorporateActionGeneralInformation40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation48
	 * CorporateActionGeneralInformation48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation48> forCorporateActionGeneralInformation48 = new MMConstraint<CorporateActionGeneralInformation48>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation48.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71
	 * CorporateActionGeneralInformation71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation88
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation88}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation55
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation55}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation71> forCorporateActionGeneralInformation71 = new MMConstraint<CorporateActionGeneralInformation71>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation88);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation55;
			owner_lazy = () -> CorporateActionGeneralInformation71.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69
	 * CorporateActionGeneralInformation69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation84
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation84}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation54
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation54}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation69> forCorporateActionGeneralInformation69 = new MMConstraint<CorporateActionGeneralInformation69>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation84);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation54;
			owner_lazy = () -> CorporateActionGeneralInformation69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70
	 * CorporateActionGeneralInformation70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation85
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation85}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation51
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation51}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation70> forCorporateActionGeneralInformation70 = new MMConstraint<CorporateActionGeneralInformation70>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation85);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation51;
			owner_lazy = () -> CorporateActionGeneralInformation70.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78
	 * CorporateActionGeneralInformation78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation78> forCorporateActionGeneralInformation78 = new MMConstraint<CorporateActionGeneralInformation78>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation78.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77
	 * CorporateActionGeneralInformation77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation77> forCorporateActionGeneralInformation77 = new MMConstraint<CorporateActionGeneralInformation77>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation77;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation77.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76
	 * CorporateActionGeneralInformation76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation76> forCorporateActionGeneralInformation76 = new MMConstraint<CorporateActionGeneralInformation76>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation76;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation76.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79
	 * CorporateActionGeneralInformation79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation89
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation89}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation50
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation50}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation79> forCorporateActionGeneralInformation79 = new MMConstraint<CorporateActionGeneralInformation79>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation89);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation50;
			owner_lazy = () -> CorporateActionGeneralInformation79.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83
	 * CorporateActionGeneralInformation83}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation83> forCorporateActionGeneralInformation83 = new MMConstraint<CorporateActionGeneralInformation83>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation83;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation83.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82
	 * CorporateActionGeneralInformation82}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation82> forCorporateActionGeneralInformation82 = new MMConstraint<CorporateActionGeneralInformation82>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation82;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation82.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92
	 * CorporateActionGeneralInformation92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation40
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation40}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation92> forCorporateActionGeneralInformation92 = new MMConstraint<CorporateActionGeneralInformation92>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation92;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation40;
			owner_lazy = () -> CorporateActionGeneralInformation92.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89
	 * CorporateActionGeneralInformation89}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation111
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation111}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation79
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation79}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation89> forCorporateActionGeneralInformation89 = new MMConstraint<CorporateActionGeneralInformation89>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation89;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation111);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation79;
			owner_lazy = () -> CorporateActionGeneralInformation89.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88
	 * CorporateActionGeneralInformation88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation107
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation107}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation71
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation71}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation88> forCorporateActionGeneralInformation88 = new MMConstraint<CorporateActionGeneralInformation88>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation88;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation107);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation71;
			owner_lazy = () -> CorporateActionGeneralInformation88.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86
	 * CorporateActionGeneralInformation86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation108
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation108}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation56
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation56}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation86> forCorporateActionGeneralInformation86 = new MMConstraint<CorporateActionGeneralInformation86>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation86;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation108);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation56;
			owner_lazy = () -> CorporateActionGeneralInformation86.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91
	 * CorporateActionGeneralInformation91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation109
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation109}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation52
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation52}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation91> forCorporateActionGeneralInformation91 = new MMConstraint<CorporateActionGeneralInformation91>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation91;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation109);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation52;
			owner_lazy = () -> CorporateActionGeneralInformation91.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87
	 * CorporateActionGeneralInformation87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation112
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation112}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation53
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation53}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation87> forCorporateActionGeneralInformation87 = new MMConstraint<CorporateActionGeneralInformation87>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation87;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation112);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation53;
			owner_lazy = () -> CorporateActionGeneralInformation87.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84
	 * CorporateActionGeneralInformation84}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation106
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation106}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation69
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation69}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation84> forCorporateActionGeneralInformation84 = new MMConstraint<CorporateActionGeneralInformation84>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation84;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation106);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation69;
			owner_lazy = () -> CorporateActionGeneralInformation84.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85
	 * CorporateActionGeneralInformation85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation105
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation105}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation70
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation70}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation85> forCorporateActionGeneralInformation85 = new MMConstraint<CorporateActionGeneralInformation85>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation105);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation70;
			owner_lazy = () -> CorporateActionGeneralInformation85.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation90
	 * CorporateActionGeneralInformation90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation110
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation110}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation49
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation49}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation90> forCorporateActionGeneralInformation90 = new MMConstraint<CorporateActionGeneralInformation90>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation110);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation49;
			owner_lazy = () -> CorporateActionGeneralInformation90.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93
	 * CorporateActionGeneralInformation93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation93> forCorporateActionGeneralInformation93 = new MMConstraint<CorporateActionGeneralInformation93>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation93;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation93.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98
	 * CorporateActionGeneralInformation98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation98> forCorporateActionGeneralInformation98 = new MMConstraint<CorporateActionGeneralInformation98>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation98;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation98.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100
	 * CorporateActionGeneralInformation100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation100> forCorporateActionGeneralInformation100 = new MMConstraint<CorporateActionGeneralInformation100>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation100;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation100.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation102
	 * CorporateActionGeneralInformation102}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation102> forCorporateActionGeneralInformation102 = new MMConstraint<CorporateActionGeneralInformation102>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation102;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation102.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97
	 * CorporateActionGeneralInformation97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation97> forCorporateActionGeneralInformation97 = new MMConstraint<CorporateActionGeneralInformation97>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation97.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99
	 * CorporateActionGeneralInformation99}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation99> forCorporateActionGeneralInformation99 = new MMConstraint<CorporateActionGeneralInformation99>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation99;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation99.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94
	 * CorporateActionGeneralInformation94}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation94> forCorporateActionGeneralInformation94 = new MMConstraint<CorporateActionGeneralInformation94>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation94;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation94.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103
	 * CorporateActionGeneralInformation103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation103> forCorporateActionGeneralInformation103 = new MMConstraint<CorporateActionGeneralInformation103>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation103;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation103.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation104
	 * CorporateActionGeneralInformation104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation104> forCorporateActionGeneralInformation104 = new MMConstraint<CorporateActionGeneralInformation104>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation104;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation104.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109
	 * CorporateActionGeneralInformation109}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation91
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation91}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation109> forCorporateActionGeneralInformation109 = new MMConstraint<CorporateActionGeneralInformation109>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation109;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation91;
			owner_lazy = () -> CorporateActionGeneralInformation109.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111
	 * CorporateActionGeneralInformation111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation89
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation89}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation111> forCorporateActionGeneralInformation111 = new MMConstraint<CorporateActionGeneralInformation111>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation111;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation89;
			owner_lazy = () -> CorporateActionGeneralInformation111.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112
	 * CorporateActionGeneralInformation112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation87
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation87}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation112> forCorporateActionGeneralInformation112 = new MMConstraint<CorporateActionGeneralInformation112>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation112;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation87;
			owner_lazy = () -> CorporateActionGeneralInformation112.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110
	 * CorporateActionGeneralInformation110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation90
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation90}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation110> forCorporateActionGeneralInformation110 = new MMConstraint<CorporateActionGeneralInformation110>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation110;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation90;
			owner_lazy = () -> CorporateActionGeneralInformation110.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105
	 * CorporateActionGeneralInformation105}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation85
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation85}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation105> forCorporateActionGeneralInformation105 = new MMConstraint<CorporateActionGeneralInformation105>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation105;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation85;
			owner_lazy = () -> CorporateActionGeneralInformation105.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107
	 * CorporateActionGeneralInformation107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation88
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation88}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation107> forCorporateActionGeneralInformation107 = new MMConstraint<CorporateActionGeneralInformation107>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation107;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation88;
			owner_lazy = () -> CorporateActionGeneralInformation107.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106
	 * CorporateActionGeneralInformation106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation84
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation84}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation106> forCorporateActionGeneralInformation106 = new MMConstraint<CorporateActionGeneralInformation106>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation106;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation84;
			owner_lazy = () -> CorporateActionGeneralInformation106.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108
	 * CorporateActionGeneralInformation108}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation86
	 * ConstraintOfficialCorporateActionEventReference.
	 * forCorporateActionGeneralInformation86}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation108> forCorporateActionGeneralInformation108 = new MMConstraint<CorporateActionGeneralInformation108>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation108;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation86;
			owner_lazy = () -> CorporateActionGeneralInformation108.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114
	 * CorporateActionGeneralInformation114}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation114> forCorporateActionGeneralInformation114 = new MMConstraint<CorporateActionGeneralInformation114>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation114;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation114.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120
	 * CorporateActionGeneralInformation120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation120> forCorporateActionGeneralInformation120 = new MMConstraint<CorporateActionGeneralInformation120>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation120;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation120.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115
	 * CorporateActionGeneralInformation115}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation115> forCorporateActionGeneralInformation115 = new MMConstraint<CorporateActionGeneralInformation115>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation115;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation115.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118
	 * CorporateActionGeneralInformation118}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation118> forCorporateActionGeneralInformation118 = new MMConstraint<CorporateActionGeneralInformation118>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation118;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation118.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation121
	 * CorporateActionGeneralInformation121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation121> forCorporateActionGeneralInformation121 = new MMConstraint<CorporateActionGeneralInformation121>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation121;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation121.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123
	 * CorporateActionGeneralInformation123}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation123> forCorporateActionGeneralInformation123 = new MMConstraint<CorporateActionGeneralInformation123>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation123;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation123.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117
	 * CorporateActionGeneralInformation117}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation117> forCorporateActionGeneralInformation117 = new MMConstraint<CorporateActionGeneralInformation117>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation117;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation117.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113
	 * CorporateActionGeneralInformation113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation113> forCorporateActionGeneralInformation113 = new MMConstraint<CorporateActionGeneralInformation113>() {
		{
			validator = ConstraintOfficialCorporateActionEventReference::checkCorporateActionGeneralInformation113;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation113.mmObject();
		}
	};

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation35(CorporateActionGeneralInformation35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation43(CorporateActionGeneralInformation43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation53(CorporateActionGeneralInformation53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation56(CorporateActionGeneralInformation56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation57(CorporateActionGeneralInformation57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation34(CorporateActionGeneralInformation34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation42(CorporateActionGeneralInformation42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation52(CorporateActionGeneralInformation52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation58(CorporateActionGeneralInformation58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation36(CorporateActionGeneralInformation36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation44(CorporateActionGeneralInformation44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation55(CorporateActionGeneralInformation55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation61(CorporateActionGeneralInformation61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation33(CorporateActionGeneralInformation33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation41(CorporateActionGeneralInformation41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation49(CorporateActionGeneralInformation49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation68(CorporateActionGeneralInformation68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation39(CorporateActionGeneralInformation39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation47(CorporateActionGeneralInformation47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation50(CorporateActionGeneralInformation50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation62(CorporateActionGeneralInformation62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation38(CorporateActionGeneralInformation38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation46(CorporateActionGeneralInformation46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation54(CorporateActionGeneralInformation54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation64(CorporateActionGeneralInformation64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation63(CorporateActionGeneralInformation63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation37(CorporateActionGeneralInformation37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation45(CorporateActionGeneralInformation45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation51(CorporateActionGeneralInformation51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation67(CorporateActionGeneralInformation67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation40(CorporateActionGeneralInformation40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation48(CorporateActionGeneralInformation48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation71(CorporateActionGeneralInformation71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation69(CorporateActionGeneralInformation69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation70(CorporateActionGeneralInformation70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation78(CorporateActionGeneralInformation78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation77(CorporateActionGeneralInformation77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation76(CorporateActionGeneralInformation76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation79(CorporateActionGeneralInformation79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation83(CorporateActionGeneralInformation83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation82(CorporateActionGeneralInformation82 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation92(CorporateActionGeneralInformation92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation89(CorporateActionGeneralInformation89 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation88(CorporateActionGeneralInformation88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation86(CorporateActionGeneralInformation86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation91(CorporateActionGeneralInformation91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation87(CorporateActionGeneralInformation87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation84(CorporateActionGeneralInformation84 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation85(CorporateActionGeneralInformation85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation90(CorporateActionGeneralInformation90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation93(CorporateActionGeneralInformation93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation98(CorporateActionGeneralInformation98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation100(CorporateActionGeneralInformation100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation102(CorporateActionGeneralInformation102 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation97(CorporateActionGeneralInformation97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation99(CorporateActionGeneralInformation99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation94(CorporateActionGeneralInformation94 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation103(CorporateActionGeneralInformation103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation104(CorporateActionGeneralInformation104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation109(CorporateActionGeneralInformation109 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation111(CorporateActionGeneralInformation111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation112(CorporateActionGeneralInformation112 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation110(CorporateActionGeneralInformation110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation105(CorporateActionGeneralInformation105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation107(CorporateActionGeneralInformation107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation106(CorporateActionGeneralInformation106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation108(CorporateActionGeneralInformation108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation114(CorporateActionGeneralInformation114 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation120(CorporateActionGeneralInformation120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation115(CorporateActionGeneralInformation115 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation118(CorporateActionGeneralInformation118 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation121(CorporateActionGeneralInformation121 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation123(CorporateActionGeneralInformation123 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation117(CorporateActionGeneralInformation117 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation113(CorporateActionGeneralInformation113 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
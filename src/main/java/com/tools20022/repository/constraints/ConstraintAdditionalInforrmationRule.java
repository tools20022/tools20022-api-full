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
 * The AdditionalInformation field in all elements must not contain information
 * that can be provided in a structured field unless bilaterally agreed or
 * advised differently in the element definition as in NarrativeVersion,
 */
public class ConstraintAdditionalInforrmationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification35
	 * PartyIdentification35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification35> forPartyIdentification35 = new MMConstraint<PartyIdentification35>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentification35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentification35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount14
	 * PartyIdentificationAndAccount14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount14> forPartyIdentificationAndAccount14 = new MMConstraint<PartyIdentificationAndAccount14>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount17
	 * PartyIdentificationAndAccount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount17> forPartyIdentificationAndAccount17 = new MMConstraint<PartyIdentificationAndAccount17>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount18
	 * PartyIdentificationAndAccount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount18> forPartyIdentificationAndAccount18 = new MMConstraint<PartyIdentificationAndAccount18>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification37
	 * PartyIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification37> forPartyIdentification37 = new MMConstraint<PartyIdentification37>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentification37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentification37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount22
	 * PartyIdentificationAndAccount22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount22> forPartyIdentificationAndAccount22 = new MMConstraint<PartyIdentificationAndAccount22>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount23
	 * PartyIdentificationAndAccount23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount23> forPartyIdentificationAndAccount23 = new MMConstraint<PartyIdentificationAndAccount23>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount24
	 * PartyIdentificationAndAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount24> forPartyIdentificationAndAccount24 = new MMConstraint<PartyIdentificationAndAccount24>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification47
	 * PartyIdentification47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentification92
	 * ConstraintAdditionalInforrmationRule.forPartyIdentification92}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification47> forPartyIdentification47 = new MMConstraint<PartyIdentification47>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentification47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentification92);
			owner_lazy = () -> PartyIdentification47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount51
	 * PartyIdentificationAndAccount51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentificationAndAccount122
	 * ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount122}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount51> forPartyIdentificationAndAccount51 = new MMConstraint<PartyIdentificationAndAccount51>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount122);
			owner_lazy = () -> PartyIdentificationAndAccount51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52
	 * PartyIdentificationAndAccount52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentificationAndAccount121
	 * ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount121}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount52> forPartyIdentificationAndAccount52 = new MMConstraint<PartyIdentificationAndAccount52>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount121);
			owner_lazy = () -> PartyIdentificationAndAccount52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54
	 * PartyIdentificationAndAccount54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentificationAndAccount101
	 * ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount101}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount54> forPartyIdentificationAndAccount54 = new MMConstraint<PartyIdentificationAndAccount54>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount54;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount101);
			owner_lazy = () -> PartyIdentificationAndAccount54.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification49
	 * PartyIdentification49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification49> forPartyIdentification49 = new MMConstraint<PartyIdentification49>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentification49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentification49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount56
	 * PartyIdentificationAndAccount56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount56> forPartyIdentificationAndAccount56 = new MMConstraint<PartyIdentificationAndAccount56>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount57
	 * PartyIdentificationAndAccount57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount57> forPartyIdentificationAndAccount57 = new MMConstraint<PartyIdentificationAndAccount57>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount58
	 * PartyIdentificationAndAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount58> forPartyIdentificationAndAccount58 = new MMConstraint<PartyIdentificationAndAccount58>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5
	 * CorporateActionNarrative5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative5> forCorporateActionNarrative5 = new MMConstraint<CorporateActionNarrative5>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6
	 * CorporateActionNarrative6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionNarrative28
	 * ConstraintAdditionalInformationRule.forCorporateActionNarrative28}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative6> forCorporateActionNarrative6 = new MMConstraint<CorporateActionNarrative6>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionNarrative28);
			owner_lazy = () -> CorporateActionNarrative6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative15
	 * CorporateActionNarrative15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative15> forCorporateActionNarrative15 = new MMConstraint<CorporateActionNarrative15>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16
	 * CorporateActionNarrative16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative16> forCorporateActionNarrative16 = new MMConstraint<CorporateActionNarrative16>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative20
	 * CorporateActionNarrative20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionNarrative29
	 * ConstraintAdditionalInformationRule.forCorporateActionNarrative29}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative20> forCorporateActionNarrative20 = new MMConstraint<CorporateActionNarrative20>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionNarrative29);
			owner_lazy = () -> CorporateActionNarrative20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22
	 * CorporateActionNarrative22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative22> forCorporateActionNarrative22 = new MMConstraint<CorporateActionNarrative22>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3
	 * CorporateActionNarrative3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative3> forCorporateActionNarrative3 = new MMConstraint<CorporateActionNarrative3>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation2
	 * UpdatedAdditionalInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forUpdatedAdditionalInformation8
	 * ConstraintAdditionalInformationRule.forUpdatedAdditionalInformation8}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation2> forUpdatedAdditionalInformation2 = new MMConstraint<UpdatedAdditionalInformation2>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkUpdatedAdditionalInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forUpdatedAdditionalInformation8);
			owner_lazy = () -> UpdatedAdditionalInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11
	 * CorporateActionNarrative11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionNarrative27
	 * ConstraintAdditionalInformationRule.forCorporateActionNarrative27}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative11> forCorporateActionNarrative11 = new MMConstraint<CorporateActionNarrative11>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionNarrative27);
			owner_lazy = () -> CorporateActionNarrative11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative18
	 * CorporateActionNarrative18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative18> forCorporateActionNarrative18 = new MMConstraint<CorporateActionNarrative18>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation4> forUpdatedAdditionalInformation4 = new MMConstraint<UpdatedAdditionalInformation4>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkUpdatedAdditionalInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative17> forCorporateActionNarrative17 = new MMConstraint<CorporateActionNarrative17>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative24
	 * CorporateActionNarrative24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionNarrative26
	 * ConstraintAdditionalInformationRule.forCorporateActionNarrative26}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative24> forCorporateActionNarrative24 = new MMConstraint<CorporateActionNarrative24>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionNarrative26);
			owner_lazy = () -> CorporateActionNarrative24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative25
	 * CorporateActionNarrative25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative25> forCorporateActionNarrative25 = new MMConstraint<CorporateActionNarrative25>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkCorporateActionNarrative25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
	 * PartyIdentificationAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount34> forPartyIdentificationAndAccount34 = new MMConstraint<PartyIdentificationAndAccount34>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation7
	 * UpdatedAdditionalInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation7> forUpdatedAdditionalInformation7 = new MMConstraint<UpdatedAdditionalInformation7>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkUpdatedAdditionalInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> UpdatedAdditionalInformation7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount101
	 * PartyIdentificationAndAccount101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentificationAndAccount54
	 * ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount54}</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount101> forPartyIdentificationAndAccount101 = new MMConstraint<PartyIdentificationAndAccount101>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount101;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount54;
			owner_lazy = () -> PartyIdentificationAndAccount101.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount104
	 * PartyIdentificationAndAccount104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount104> forPartyIdentificationAndAccount104 = new MMConstraint<PartyIdentificationAndAccount104>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount104;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> PartyIdentificationAndAccount104.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122
	 * PartyIdentificationAndAccount122}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentificationAndAccount51
	 * ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount51}</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount122> forPartyIdentificationAndAccount122 = new MMConstraint<PartyIdentificationAndAccount122>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount122;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount51;
			owner_lazy = () -> PartyIdentificationAndAccount122.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification92
	 * PartyIdentification92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentification47
	 * ConstraintAdditionalInforrmationRule.forPartyIdentification47}</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification92> forPartyIdentification92 = new MMConstraint<PartyIdentification92>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentification92;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentification47;
			owner_lazy = () -> PartyIdentification92.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120
	 * PartyIdentificationAndAccount120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount120> forPartyIdentificationAndAccount120 = new MMConstraint<PartyIdentificationAndAccount120>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount120;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> PartyIdentificationAndAccount120.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121
	 * PartyIdentificationAndAccount121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentificationAndAccount52
	 * ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount52}</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount121> forPartyIdentificationAndAccount121 = new MMConstraint<PartyIdentificationAndAccount121>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount121;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentificationAndAccount52;
			owner_lazy = () -> PartyIdentificationAndAccount121.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification102
	 * PartyIdentification102}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentification120
	 * ConstraintAdditionalInforrmationRule.forPartyIdentification120}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification102> forPartyIdentification102 = new MMConstraint<PartyIdentification102>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentification102;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentification120);
			owner_lazy = () -> PartyIdentification102.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount129
	 * PartyIdentificationAndAccount129}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount129> forPartyIdentificationAndAccount129 = new MMConstraint<PartyIdentificationAndAccount129>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount129;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> PartyIdentificationAndAccount129.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount130
	 * PartyIdentificationAndAccount130}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount130> forPartyIdentificationAndAccount130 = new MMConstraint<PartyIdentificationAndAccount130>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount130;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> PartyIdentificationAndAccount130.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128
	 * PartyIdentificationAndAccount128}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount128> forPartyIdentificationAndAccount128 = new MMConstraint<PartyIdentificationAndAccount128>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentificationAndAccount128;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> PartyIdentificationAndAccount128.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification120
	 * PartyIdentification120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forPartyIdentification102
	 * ConstraintAdditionalInforrmationRule.forPartyIdentification102}</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification120> forPartyIdentification120 = new MMConstraint<PartyIdentification120>() {
		{
			validator = ConstraintAdditionalInforrmationRule::checkPartyIdentification120;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forPartyIdentification102;
			owner_lazy = () -> PartyIdentification120.mmObject();
		}
	};

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentification35(PartyIdentification35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount14(PartyIdentificationAndAccount14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount17(PartyIdentificationAndAccount17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount18(PartyIdentificationAndAccount18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentification37(PartyIdentification37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount22(PartyIdentificationAndAccount22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount23(PartyIdentificationAndAccount23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount24(PartyIdentificationAndAccount24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentification47(PartyIdentification47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount51(PartyIdentificationAndAccount51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount52(PartyIdentificationAndAccount52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount54(PartyIdentificationAndAccount54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentification49(PartyIdentification49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount56(PartyIdentificationAndAccount56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount57(PartyIdentificationAndAccount57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount58(PartyIdentificationAndAccount58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative5(CorporateActionNarrative5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative6(CorporateActionNarrative6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative15(CorporateActionNarrative15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative16(CorporateActionNarrative16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative20(CorporateActionNarrative20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative22(CorporateActionNarrative22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative3(CorporateActionNarrative3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Additionalnformation element must not contain information that can be
	 * provided in a structured field unless bilaterally agreed.
	 */
	public static void checkUpdatedAdditionalInformation2(UpdatedAdditionalInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative11(CorporateActionNarrative11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative18(CorporateActionNarrative18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Additionalnformation element must not contain information that can be
	 * provided in a structured field unless bilaterally agreed.
	 */
	public static void checkUpdatedAdditionalInformation4(UpdatedAdditionalInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative17(CorporateActionNarrative17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative24(CorporateActionNarrative24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative25(CorporateActionNarrative25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount34(PartyIdentificationAndAccount34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Additionalnformation element must not contain information that can be
	 * provided in a structured field unless bilaterally agreed.
	 */
	public static void checkUpdatedAdditionalInformation7(UpdatedAdditionalInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount101(PartyIdentificationAndAccount101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkPartyIdentificationAndAccount104(PartyIdentificationAndAccount104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount122(PartyIdentificationAndAccount122 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentification92(PartyIdentification92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount120(PartyIdentificationAndAccount120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount121(PartyIdentificationAndAccount121 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentification102(PartyIdentification102 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount129(PartyIdentificationAndAccount129 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount130(PartyIdentificationAndAccount130 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount128(PartyIdentificationAndAccount128 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentification120(PartyIdentification120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
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
 * Unless bilaterally agreed between the Sender and Receiver, If
 * FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails
 * are present, then they must not contain information that can be provided in a
 * structured field.
 */
public class ConstraintAdditionalDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25
	 * SecuritiesTradeDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails32
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails25> forSecuritiesTradeDetails25 = new MMConstraint<SecuritiesTradeDetails25>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails32);
			owner_lazy = () -> SecuritiesTradeDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8
	 * FinancialInstrumentAttributes8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes8> forFinancialInstrumentAttributes8 = new MMConstraint<FinancialInstrumentAttributes8>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20
	 * FinancialInstrumentAttributes20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes20> forFinancialInstrumentAttributes20 = new MMConstraint<FinancialInstrumentAttributes20>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35
	 * FinancialInstrumentAttributes35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes64
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes64}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes35> forFinancialInstrumentAttributes35 = new MMConstraint<FinancialInstrumentAttributes35>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes64);
			owner_lazy = () -> FinancialInstrumentAttributes35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2
	 * PartyTextInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if DeclarationlDetails and/or PartyContactDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyTextInformation2> forPartyTextInformation2 = new MMConstraint<PartyTextInformation2>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkPartyTextInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if DeclarationlDetails and/or PartyContactDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyTextInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26
	 * SecuritiesTradeDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails34
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails26> forSecuritiesTradeDetails26 = new MMConstraint<SecuritiesTradeDetails26>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails34);
			owner_lazy = () -> SecuritiesTradeDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27
	 * SecuritiesTradeDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails27> forSecuritiesTradeDetails27 = new MMConstraint<SecuritiesTradeDetails27>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41
	 * FinancialInstrumentAttributes41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes41> forFinancialInstrumentAttributes41 = new MMConstraint<FinancialInstrumentAttributes41>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation4
	 * PartyTextInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if DeclarationlDetails and/or PartyContactDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyTextInformation4> forPartyTextInformation4 = new MMConstraint<PartyTextInformation4>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkPartyTextInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if DeclarationlDetails and/or PartyContactDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyTextInformation4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28
	 * SecuritiesTradeDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails28> forSecuritiesTradeDetails28 = new MMConstraint<SecuritiesTradeDetails28>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4
	 * FinancialInstrumentAttributes4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes4> forFinancialInstrumentAttributes4 = new MMConstraint<FinancialInstrumentAttributes4>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2
	 * IntraPositionDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails2> forIntraPositionDetails2 = new MMConstraint<IntraPositionDetails2>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13
	 * FinancialInstrumentAttributes13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes13> forFinancialInstrumentAttributes13 = new MMConstraint<FinancialInstrumentAttributes13>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8
	 * IntraPositionDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails8> forIntraPositionDetails8 = new MMConstraint<IntraPositionDetails8>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21
	 * FinancialInstrumentAttributes21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes21> forFinancialInstrumentAttributes21 = new MMConstraint<FinancialInstrumentAttributes21>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12
	 * IntraPositionDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails12> forIntraPositionDetails12 = new MMConstraint<IntraPositionDetails12>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26
	 * FinancialInstrumentAttributes26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes26> forFinancialInstrumentAttributes26 = new MMConstraint<FinancialInstrumentAttributes26>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13
	 * IntraPositionDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails13> forIntraPositionDetails13 = new MMConstraint<IntraPositionDetails13>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes63
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes63}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes36> forFinancialInstrumentAttributes36 = new MMConstraint<FinancialInstrumentAttributes36>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes63);
			owner_lazy = () -> FinancialInstrumentAttributes36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22
	 * IntraPositionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails22> forIntraPositionDetails22 = new MMConstraint<IntraPositionDetails22>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42
	 * FinancialInstrumentAttributes42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes42> forFinancialInstrumentAttributes42 = new MMConstraint<FinancialInstrumentAttributes42>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26
	 * IntraPositionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails26> forIntraPositionDetails26 = new MMConstraint<IntraPositionDetails26>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27
	 * IntraPositionDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails34
	 * ConstraintAdditionalDetailsRule.forIntraPositionDetails34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails27> forIntraPositionDetails27 = new MMConstraint<IntraPositionDetails27>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails34);
			owner_lazy = () -> IntraPositionDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29
	 * IntraPositionDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails29> forIntraPositionDetails29 = new MMConstraint<IntraPositionDetails29>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1
	 * IntraPositionMovementDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails1> forIntraPositionMovementDetails1 = new MMConstraint<IntraPositionMovementDetails1>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2
	 * IntraPositionMovementDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails2> forIntraPositionMovementDetails2 = new MMConstraint<IntraPositionMovementDetails2>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5
	 * IntraPositionMovementDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails5> forIntraPositionMovementDetails5 = new MMConstraint<IntraPositionMovementDetails5>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27
	 * FinancialInstrumentAttributes27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes27> forFinancialInstrumentAttributes27 = new MMConstraint<FinancialInstrumentAttributes27>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails6> forIntraPositionMovementDetails6 = new MMConstraint<IntraPositionMovementDetails6>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7
	 * IntraPositionMovementDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails7> forIntraPositionMovementDetails7 = new MMConstraint<IntraPositionMovementDetails7>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8
	 * IntraPositionMovementDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails8> forIntraPositionMovementDetails8 = new MMConstraint<IntraPositionMovementDetails8>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9
	 * IntraPositionMovementDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionMovementDetails11
	 * ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails9> forIntraPositionMovementDetails9 = new MMConstraint<IntraPositionMovementDetails9>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails11);
			owner_lazy = () -> IntraPositionMovementDetails9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10
	 * IntraPositionMovementDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails10> forIntraPositionMovementDetails10 = new MMConstraint<IntraPositionMovementDetails10>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14
	 * FinancialInstrumentAttributes14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes14> forFinancialInstrumentAttributes14 = new MMConstraint<FinancialInstrumentAttributes14>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30
	 * FinancialInstrumentAttributes30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes30> forFinancialInstrumentAttributes30 = new MMConstraint<FinancialInstrumentAttributes30>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6
	 * SecuritiesTradeDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails38
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails38}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails6> forSecuritiesTradeDetails6 = new MMConstraint<SecuritiesTradeDetails6>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails38);
			owner_lazy = () -> SecuritiesTradeDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13
	 * SecuritiesTradeDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails13> forSecuritiesTradeDetails13 = new MMConstraint<SecuritiesTradeDetails13>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28
	 * FinancialInstrumentAttributes28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes28> forFinancialInstrumentAttributes28 = new MMConstraint<FinancialInstrumentAttributes28>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3
	 * SecuritiesTradeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails37
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails37}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails3> forSecuritiesTradeDetails3 = new MMConstraint<SecuritiesTradeDetails3>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails37);
			owner_lazy = () -> SecuritiesTradeDetails3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11
	 * SecuritiesTradeDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails11> forSecuritiesTradeDetails11 = new MMConstraint<SecuritiesTradeDetails11>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2
	 * SecuritiesTradeDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails31
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails31}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails2> forSecuritiesTradeDetails2 = new MMConstraint<SecuritiesTradeDetails2>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails31);
			owner_lazy = () -> SecuritiesTradeDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16
	 * SecuritiesTradeDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails16> forSecuritiesTradeDetails16 = new MMConstraint<SecuritiesTradeDetails16>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1
	 * SecuritiesTradeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails33
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails1> forSecuritiesTradeDetails1 = new MMConstraint<SecuritiesTradeDetails1>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails33);
			owner_lazy = () -> SecuritiesTradeDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15
	 * SecuritiesTradeDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails15> forSecuritiesTradeDetails15 = new MMConstraint<SecuritiesTradeDetails15>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7
	 * TransactionDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails7> forTransactionDetails7 = new MMConstraint<TransactionDetails7>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8
	 * TransactionDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails8> forTransactionDetails8 = new MMConstraint<TransactionDetails8>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16
	 * TransactionDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails16> forTransactionDetails16 = new MMConstraint<TransactionDetails16>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17
	 * TransactionDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails17> forTransactionDetails17 = new MMConstraint<TransactionDetails17>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26
	 * TransactionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails26> forTransactionDetails26 = new MMConstraint<TransactionDetails26>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25
	 * TransactionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails25> forTransactionDetails25 = new MMConstraint<TransactionDetails25>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27
	 * TransactionDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails27> forTransactionDetails27 = new MMConstraint<TransactionDetails27>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33
	 * TransactionDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails33> forTransactionDetails33 = new MMConstraint<TransactionDetails33>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39
	 * TransactionDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails39> forTransactionDetails39 = new MMConstraint<TransactionDetails39>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50
	 * TransactionDetails50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails50> forTransactionDetails50 = new MMConstraint<TransactionDetails50>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56
	 * TransactionDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails62
	 * ConstraintAdditionalDetailsRule.forTransactionDetails62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails56> forTransactionDetails56 = new MMConstraint<TransactionDetails56>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails62);
			owner_lazy = () -> TransactionDetails56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59
	 * TransactionDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails59> forTransactionDetails59 = new MMConstraint<TransactionDetails59>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails59.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6
	 * TransactionDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails6> forTransactionDetails6 = new MMConstraint<TransactionDetails6>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18
	 * TransactionDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails18> forTransactionDetails18 = new MMConstraint<TransactionDetails18>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24
	 * TransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails24> forTransactionDetails24 = new MMConstraint<TransactionDetails24>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34
	 * TransactionDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails34> forTransactionDetails34 = new MMConstraint<TransactionDetails34>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37
	 * TransactionDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails37> forTransactionDetails37 = new MMConstraint<TransactionDetails37>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48
	 * TransactionDetails48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails48> forTransactionDetails48 = new MMConstraint<TransactionDetails48>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails48.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57
	 * TransactionDetails57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails63
	 * ConstraintAdditionalDetailsRule.forTransactionDetails63}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails57> forTransactionDetails57 = new MMConstraint<TransactionDetails57>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails63);
			owner_lazy = () -> TransactionDetails57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60
	 * TransactionDetails60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails60> forTransactionDetails60 = new MMConstraint<TransactionDetails60>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails60.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31
	 * FinancialInstrumentAttributes31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes31> forFinancialInstrumentAttributes31 = new MMConstraint<FinancialInstrumentAttributes31>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44
	 * FinancialInstrumentAttributes44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes44> forFinancialInstrumentAttributes44 = new MMConstraint<FinancialInstrumentAttributes44>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1
	 * IntraPositionDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails1> forIntraPositionDetails1 = new MMConstraint<IntraPositionDetails1>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11
	 * IntraPositionDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails11> forIntraPositionDetails11 = new MMConstraint<IntraPositionDetails11>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5
	 * SecuritiesTradeDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails5> forSecuritiesTradeDetails5 = new MMConstraint<SecuritiesTradeDetails5>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2
	 * SecuritiesFinancingTransactionDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails2> forSecuritiesFinancingTransactionDetails2 = new MMConstraint<SecuritiesFinancingTransactionDetails2>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8
	 * SecuritiesFinancingTransactionDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails8> forSecuritiesFinancingTransactionDetails8 = new MMConstraint<SecuritiesFinancingTransactionDetails8>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15
	 * FinancialInstrumentAttributes15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes15> forFinancialInstrumentAttributes15 = new MMConstraint<FinancialInstrumentAttributes15>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails12
	 * SecuritiesTradeDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails12> forSecuritiesTradeDetails12 = new MMConstraint<SecuritiesTradeDetails12>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6
	 * SecuritiesFinancingTransactionDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails6> forSecuritiesFinancingTransactionDetails6 = new MMConstraint<SecuritiesFinancingTransactionDetails6>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10
	 * SecuritiesFinancingTransactionDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails10> forSecuritiesFinancingTransactionDetails10 = new MMConstraint<SecuritiesFinancingTransactionDetails10>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17
	 * SecuritiesFinancingTransactionDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesFinancingTransactionDetails21
	 * ConstraintAdditionalDetailsRule.
	 * forSecuritiesFinancingTransactionDetails21}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails17> forSecuritiesFinancingTransactionDetails17 = new MMConstraint<SecuritiesFinancingTransactionDetails17>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails21);
			owner_lazy = () -> SecuritiesFinancingTransactionDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18
	 * SecuritiesFinancingTransactionDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails18> forSecuritiesFinancingTransactionDetails18 = new MMConstraint<SecuritiesFinancingTransactionDetails18>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29
	 * FinancialInstrumentAttributes29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes29> forFinancialInstrumentAttributes29 = new MMConstraint<FinancialInstrumentAttributes29>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7
	 * IntraPositionDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails7> forIntraPositionDetails7 = new MMConstraint<IntraPositionDetails7>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16
	 * IntraPositionDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails16> forIntraPositionDetails16 = new MMConstraint<IntraPositionDetails16>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21
	 * IntraPositionDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails33
	 * ConstraintAdditionalDetailsRule.forIntraPositionDetails33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails21> forIntraPositionDetails21 = new MMConstraint<IntraPositionDetails21>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails33);
			owner_lazy = () -> IntraPositionDetails21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails25> forIntraPositionDetails25 = new MMConstraint<IntraPositionDetails25>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3
	 * IntraPositionMovementDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails3> forIntraPositionMovementDetails3 = new MMConstraint<IntraPositionMovementDetails3>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4
	 * IntraPositionMovementDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails4> forIntraPositionMovementDetails4 = new MMConstraint<IntraPositionMovementDetails4>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance1 IntraBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the sender and the receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraBalance3
	 * ConstraintAdditionalDetailsRule.forIntraBalance3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalance1> forIntraBalance1 = new MMConstraint<IntraBalance1>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraBalance1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the sender and the receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraBalance3);
			owner_lazy = () -> IntraBalance1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51
	 * TransactionDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the sender and receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails93
	 * ConstraintAdditionalDetailsRule.forTransactionDetails93}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails51> forTransactionDetails51 = new MMConstraint<TransactionDetails51>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the sender and receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails93);
			owner_lazy = () -> TransactionDetails51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2
	 * FinancialInstrumentAttributes2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, FinancialInstrumentAttributeAdditionalDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes2> forFinancialInstrumentAttributes2 = new MMConstraint<FinancialInstrumentAttributes2>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, FinancialInstrumentAttributeAdditionalDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21
	 * SecuritiesFinancingTransactionDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesFinancingTransactionDetails24
	 * ConstraintAdditionalDetailsRule.
	 * forSecuritiesFinancingTransactionDetails24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesFinancingTransactionDetails17
	 * ConstraintAdditionalDetailsRule.
	 * forSecuritiesFinancingTransactionDetails17}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails21> forSecuritiesFinancingTransactionDetails21 = new MMConstraint<SecuritiesFinancingTransactionDetails21>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails17;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62
	 * TransactionDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails69
	 * ConstraintAdditionalDetailsRule.forTransactionDetails69}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails56
	 * ConstraintAdditionalDetailsRule.forTransactionDetails56}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails62> forTransactionDetails62 = new MMConstraint<TransactionDetails62>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails69);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails56;
			owner_lazy = () -> TransactionDetails62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63
	 * TransactionDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails78
	 * ConstraintAdditionalDetailsRule.forTransactionDetails78}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails57
	 * ConstraintAdditionalDetailsRule.forTransactionDetails57}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails63> forTransactionDetails63 = new MMConstraint<TransactionDetails63>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails78);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails57;
			owner_lazy = () -> TransactionDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31
	 * SecuritiesTradeDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails53
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails53}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails2
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails2}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails31> forSecuritiesTradeDetails31 = new MMConstraint<SecuritiesTradeDetails31>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails53);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails2;
			owner_lazy = () -> SecuritiesTradeDetails31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails51
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails1
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails33> forSecuritiesTradeDetails33 = new MMConstraint<SecuritiesTradeDetails33>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails51);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails1;
			owner_lazy = () -> SecuritiesTradeDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails55
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails55}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails6
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails6}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails38> forSecuritiesTradeDetails38 = new MMConstraint<SecuritiesTradeDetails38>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails55);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails6;
			owner_lazy = () -> SecuritiesTradeDetails38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37
	 * SecuritiesTradeDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails56
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails56}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails3
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails37> forSecuritiesTradeDetails37 = new MMConstraint<SecuritiesTradeDetails37>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails3;
			owner_lazy = () -> SecuritiesTradeDetails37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34
	 * SecuritiesTradeDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails52
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails52}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails26
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails26}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails34> forSecuritiesTradeDetails34 = new MMConstraint<SecuritiesTradeDetails34>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails52);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails26;
			owner_lazy = () -> SecuritiesTradeDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32
	 * SecuritiesTradeDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails50
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails25
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails25}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails32> forSecuritiesTradeDetails32 = new MMConstraint<SecuritiesTradeDetails32>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails25;
			owner_lazy = () -> SecuritiesTradeDetails32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44
	 * SecuritiesTradeDetails44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails44> forSecuritiesTradeDetails44 = new MMConstraint<SecuritiesTradeDetails44>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39
	 * SecuritiesTradeDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails39> forSecuritiesTradeDetails39 = new MMConstraint<SecuritiesTradeDetails39>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43
	 * SecuritiesTradeDetails43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails43> forSecuritiesTradeDetails43 = new MMConstraint<SecuritiesTradeDetails43>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22
	 * SecuritiesFinancingTransactionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails22> forSecuritiesFinancingTransactionDetails22 = new MMConstraint<SecuritiesFinancingTransactionDetails22>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40
	 * SecuritiesTradeDetails40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails40> forSecuritiesTradeDetails40 = new MMConstraint<SecuritiesTradeDetails40>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67
	 * TransactionDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails67> forTransactionDetails67 = new MMConstraint<TransactionDetails67>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68
	 * TransactionDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails68> forTransactionDetails68 = new MMConstraint<TransactionDetails68>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46
	 * SecuritiesTradeDetails46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails46> forSecuritiesTradeDetails46 = new MMConstraint<SecuritiesTradeDetails46>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails46.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47
	 * SecuritiesTradeDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails47> forSecuritiesTradeDetails47 = new MMConstraint<SecuritiesTradeDetails47>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24
	 * SecuritiesFinancingTransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesFinancingTransactionDetails26
	 * ConstraintAdditionalDetailsRule.
	 * forSecuritiesFinancingTransactionDetails26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesFinancingTransactionDetails21
	 * ConstraintAdditionalDetailsRule.
	 * forSecuritiesFinancingTransactionDetails21}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails24> forSecuritiesFinancingTransactionDetails24 = new MMConstraint<SecuritiesFinancingTransactionDetails24>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails21;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69
	 * TransactionDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails75
	 * ConstraintAdditionalDetailsRule.forTransactionDetails75}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails62
	 * ConstraintAdditionalDetailsRule.forTransactionDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails69> forTransactionDetails69 = new MMConstraint<TransactionDetails69>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails75);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails62;
			owner_lazy = () -> TransactionDetails69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25
	 * SecuritiesFinancingTransactionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails25> forSecuritiesFinancingTransactionDetails25 = new MMConstraint<SecuritiesFinancingTransactionDetails25>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72
	 * TransactionDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails72> forTransactionDetails72 = new MMConstraint<TransactionDetails72>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails72;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails72.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26
	 * SecuritiesFinancingTransactionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesFinancingTransactionDetails35
	 * ConstraintAdditionalDetailsRule.
	 * forSecuritiesFinancingTransactionDetails35}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesFinancingTransactionDetails24
	 * ConstraintAdditionalDetailsRule.
	 * forSecuritiesFinancingTransactionDetails24}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails26> forSecuritiesFinancingTransactionDetails26 = new MMConstraint<SecuritiesFinancingTransactionDetails26>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails35);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails24;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75
	 * TransactionDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails96
	 * ConstraintAdditionalDetailsRule.forTransactionDetails96}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails69
	 * ConstraintAdditionalDetailsRule.forTransactionDetails69}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails75> forTransactionDetails75 = new MMConstraint<TransactionDetails75>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails75;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails96);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails69;
			owner_lazy = () -> TransactionDetails75.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78
	 * TransactionDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails95
	 * ConstraintAdditionalDetailsRule.forTransactionDetails95}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails63
	 * ConstraintAdditionalDetailsRule.forTransactionDetails63}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails78> forTransactionDetails78 = new MMConstraint<TransactionDetails78>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails95);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails63;
			owner_lazy = () -> TransactionDetails78.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63
	 * FinancialInstrumentAttributes63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes92
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes92}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes36
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes36}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes63> forFinancialInstrumentAttributes63 = new MMConstraint<FinancialInstrumentAttributes63>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes92);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes36;
			owner_lazy = () -> FinancialInstrumentAttributes63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33
	 * IntraPositionDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails21
	 * ConstraintAdditionalDetailsRule.forIntraPositionDetails21}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails33> forIntraPositionDetails33 = new MMConstraint<IntraPositionDetails33>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails21;
			owner_lazy = () -> IntraPositionDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes91
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes91}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes35
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes35}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes64> forFinancialInstrumentAttributes64 = new MMConstraint<FinancialInstrumentAttributes64>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes64;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes91);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes35;
			owner_lazy = () -> FinancialInstrumentAttributes64.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51
	 * SecuritiesTradeDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails67
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails73
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails73}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails33
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails51> forSecuritiesTradeDetails51 = new MMConstraint<SecuritiesTradeDetails51>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails67,
					com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails73);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails33;
			owner_lazy = () -> SecuritiesTradeDetails51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53
	 * SecuritiesTradeDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails76
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails76}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails31
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails31}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails53> forSecuritiesTradeDetails53 = new MMConstraint<SecuritiesTradeDetails53>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails76);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails31;
			owner_lazy = () -> SecuritiesTradeDetails53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55
	 * SecuritiesTradeDetails55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails74
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails74}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails38
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails38}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails55> forSecuritiesTradeDetails55 = new MMConstraint<SecuritiesTradeDetails55>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails74);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails38;
			owner_lazy = () -> SecuritiesTradeDetails55.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails77
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails77}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails37
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails37}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails56> forSecuritiesTradeDetails56 = new MMConstraint<SecuritiesTradeDetails56>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails77);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails37;
			owner_lazy = () -> SecuritiesTradeDetails56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails41
	 * ConstraintAdditionalDetailsRule.forIntraPositionDetails41}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails27
	 * ConstraintAdditionalDetailsRule.forIntraPositionDetails27}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails34> forIntraPositionDetails34 = new MMConstraint<IntraPositionDetails34>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails41);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails27;
			owner_lazy = () -> IntraPositionDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52
	 * SecuritiesTradeDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails79
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails79}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails34
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails52> forSecuritiesTradeDetails52 = new MMConstraint<SecuritiesTradeDetails52>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails79);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails34;
			owner_lazy = () -> SecuritiesTradeDetails52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11
	 * IntraPositionMovementDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionMovementDetails13
	 * ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionMovementDetails9
	 * ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails9}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails11> forIntraPositionMovementDetails11 = new MMConstraint<IntraPositionMovementDetails11>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails9;
			owner_lazy = () -> IntraPositionMovementDetails11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50
	 * SecuritiesTradeDetails50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails78
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails78}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails32
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails50> forSecuritiesTradeDetails50 = new MMConstraint<SecuritiesTradeDetails50>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails78);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails32;
			owner_lazy = () -> SecuritiesTradeDetails50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59
	 * SecuritiesTradeDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails59> forSecuritiesTradeDetails59 = new MMConstraint<SecuritiesTradeDetails59>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails59.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails33> forSecuritiesFinancingTransactionDetails33 = new MMConstraint<SecuritiesFinancingTransactionDetails33>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58
	 * SecuritiesTradeDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails58> forSecuritiesTradeDetails58 = new MMConstraint<SecuritiesTradeDetails58>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75
	 * FinancialInstrumentAttributes75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes75> forFinancialInstrumentAttributes75 = new MMConstraint<FinancialInstrumentAttributes75>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes75;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes75.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35
	 * IntraPositionDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails35> forIntraPositionDetails35 = new MMConstraint<IntraPositionDetails35>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails63> forSecuritiesTradeDetails63 = new MMConstraint<SecuritiesTradeDetails63>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36
	 * IntraPositionDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails36> forIntraPositionDetails36 = new MMConstraint<IntraPositionDetails36>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails62> forSecuritiesTradeDetails62 = new MMConstraint<SecuritiesTradeDetails62>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78
	 * FinancialInstrumentAttributes78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes78> forFinancialInstrumentAttributes78 = new MMConstraint<FinancialInstrumentAttributes78>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes78.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91
	 * TransactionDetails91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails91> forTransactionDetails91 = new MMConstraint<TransactionDetails91>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails91;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails91.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90
	 * TransactionDetails90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails90> forTransactionDetails90 = new MMConstraint<TransactionDetails90>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails90.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12
	 * IntraPositionMovementDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails12> forIntraPositionMovementDetails12 = new MMConstraint<IntraPositionMovementDetails12>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65
	 * SecuritiesTradeDetails65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails65> forSecuritiesTradeDetails65 = new MMConstraint<SecuritiesTradeDetails65>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails65.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66
	 * SecuritiesTradeDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails66> forSecuritiesTradeDetails66 = new MMConstraint<SecuritiesTradeDetails66>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails66.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance3 IntraBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the sender and the receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraBalance1
	 * ConstraintAdditionalDetailsRule.forIntraBalance1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalance3> forIntraBalance3 = new MMConstraint<IntraBalance3>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraBalance3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the sender and the receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraBalance1;
			owner_lazy = () -> IntraBalance3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93
	 * TransactionDetails93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the sender and receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails102
	 * ConstraintAdditionalDetailsRule.forTransactionDetails102}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails51
	 * ConstraintAdditionalDetailsRule.forTransactionDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails93> forTransactionDetails93 = new MMConstraint<TransactionDetails93>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails93;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the sender and receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails102);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails51;
			owner_lazy = () -> TransactionDetails93.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41
	 * IntraPositionDetails41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails46
	 * ConstraintAdditionalDetailsRule.forIntraPositionDetails46}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails34
	 * ConstraintAdditionalDetailsRule.forIntraPositionDetails34}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails41> forIntraPositionDetails41 = new MMConstraint<IntraPositionDetails41>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails46);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails34;
			owner_lazy = () -> IntraPositionDetails41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67
	 * SecuritiesTradeDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails75
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails75}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails51
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails67> forSecuritiesTradeDetails67 = new MMConstraint<SecuritiesTradeDetails67>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails75);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails51;
			owner_lazy = () -> SecuritiesTradeDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesFinancingTransactionDetails26
	 * ConstraintAdditionalDetailsRule.
	 * forSecuritiesFinancingTransactionDetails26}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails35> forSecuritiesFinancingTransactionDetails35 = new MMConstraint<SecuritiesFinancingTransactionDetails35>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails26;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96
	 * TransactionDetails96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails104
	 * ConstraintAdditionalDetailsRule.forTransactionDetails104}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails75
	 * ConstraintAdditionalDetailsRule.forTransactionDetails75}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails96> forTransactionDetails96 = new MMConstraint<TransactionDetails96>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails96;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails104);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails75;
			owner_lazy = () -> TransactionDetails96.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13
	 * IntraPositionMovementDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionMovementDetails15
	 * ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionMovementDetails11
	 * ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails11}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails13> forIntraPositionMovementDetails13 = new MMConstraint<IntraPositionMovementDetails13>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails11;
			owner_lazy = () -> IntraPositionMovementDetails13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails103
	 * ConstraintAdditionalDetailsRule.forTransactionDetails103}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails78
	 * ConstraintAdditionalDetailsRule.forTransactionDetails78}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails95> forTransactionDetails95 = new MMConstraint<TransactionDetails95>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails95;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails103);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails78;
			owner_lazy = () -> TransactionDetails95.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43
	 * IntraPositionDetails43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails43> forIntraPositionDetails43 = new MMConstraint<IntraPositionDetails43>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70
	 * SecuritiesTradeDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails70> forSecuritiesTradeDetails70 = new MMConstraint<SecuritiesTradeDetails70>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails70.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36
	 * SecuritiesFinancingTransactionDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails36> forSecuritiesFinancingTransactionDetails36 = new MMConstraint<SecuritiesFinancingTransactionDetails36>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesFinancingTransactionDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14
	 * IntraPositionMovementDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails14> forIntraPositionMovementDetails14 = new MMConstraint<IntraPositionMovementDetails14>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99
	 * TransactionDetails99}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails99> forTransactionDetails99 = new MMConstraint<TransactionDetails99>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails99;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails99.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98
	 * TransactionDetails98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails98> forTransactionDetails98 = new MMConstraint<TransactionDetails98>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails98;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails98.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102
	 * TransactionDetails102}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the sender and receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails93
	 * ConstraintAdditionalDetailsRule.forTransactionDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails102> forTransactionDetails102 = new MMConstraint<TransactionDetails102>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails102;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the sender and receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails93;
			owner_lazy = () -> TransactionDetails102.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails41
	 * ConstraintAdditionalDetailsRule.forIntraPositionDetails41}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails46> forIntraPositionDetails46 = new MMConstraint<IntraPositionDetails46>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails41;
			owner_lazy = () -> IntraPositionDetails46.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104
	 * TransactionDetails104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails96
	 * ConstraintAdditionalDetailsRule.forTransactionDetails96}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails104> forTransactionDetails104 = new MMConstraint<TransactionDetails104>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails104;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails96;
			owner_lazy = () -> TransactionDetails104.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103
	 * TransactionDetails103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forTransactionDetails95
	 * ConstraintAdditionalDetailsRule.forTransactionDetails95}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails103> forTransactionDetails103 = new MMConstraint<TransactionDetails103>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails103;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forTransactionDetails95;
			owner_lazy = () -> TransactionDetails103.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15
	 * IntraPositionMovementDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionMovementDetails13
	 * ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails13}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails15> forIntraPositionMovementDetails15 = new MMConstraint<IntraPositionMovementDetails15>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails13;
			owner_lazy = () -> IntraPositionMovementDetails15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73
	 * SecuritiesTradeDetails73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails51
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails73> forSecuritiesTradeDetails73 = new MMConstraint<SecuritiesTradeDetails73>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails73;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails51;
			owner_lazy = () -> SecuritiesTradeDetails73.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74
	 * SecuritiesTradeDetails74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails55
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails55}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails74> forSecuritiesTradeDetails74 = new MMConstraint<SecuritiesTradeDetails74>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails74;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails55;
			owner_lazy = () -> SecuritiesTradeDetails74.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75
	 * SecuritiesTradeDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails67
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails67}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails75> forSecuritiesTradeDetails75 = new MMConstraint<SecuritiesTradeDetails75>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails75;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails67;
			owner_lazy = () -> SecuritiesTradeDetails75.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76
	 * SecuritiesTradeDetails76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails53
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails53}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails76> forSecuritiesTradeDetails76 = new MMConstraint<SecuritiesTradeDetails76>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails76;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails53;
			owner_lazy = () -> SecuritiesTradeDetails76.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77
	 * SecuritiesTradeDetails77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails56
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails56}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails77> forSecuritiesTradeDetails77 = new MMConstraint<SecuritiesTradeDetails77>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails77;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails56;
			owner_lazy = () -> SecuritiesTradeDetails77.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78
	 * SecuritiesTradeDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails50
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails50}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails78> forSecuritiesTradeDetails78 = new MMConstraint<SecuritiesTradeDetails78>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails50;
			owner_lazy = () -> SecuritiesTradeDetails78.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79
	 * SecuritiesTradeDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails52
	 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails52}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails79> forSecuritiesTradeDetails79 = new MMConstraint<SecuritiesTradeDetails79>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails52;
			owner_lazy = () -> SecuritiesTradeDetails79.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91
	 * FinancialInstrumentAttributes91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes64
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes64}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes91> forFinancialInstrumentAttributes91 = new MMConstraint<FinancialInstrumentAttributes91>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes91;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes64;
			owner_lazy = () -> FinancialInstrumentAttributes91.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92
	 * FinancialInstrumentAttributes92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes63
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes63}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes92> forFinancialInstrumentAttributes92 = new MMConstraint<FinancialInstrumentAttributes92>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes92;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes63;
			owner_lazy = () -> FinancialInstrumentAttributes92.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95
	 * FinancialInstrumentAttributes95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes95> forFinancialInstrumentAttributes95 = new MMConstraint<FinancialInstrumentAttributes95>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes95;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes95.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails47
	 * IntraPositionDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails47> forIntraPositionDetails47 = new MMConstraint<IntraPositionDetails47>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails16
	 * IntraPositionMovementDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails16> forIntraPositionMovementDetails16 = new MMConstraint<IntraPositionMovementDetails16>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkIntraPositionMovementDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes97> forFinancialInstrumentAttributes97 = new MMConstraint<FinancialInstrumentAttributes97>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkFinancialInstrumentAttributes97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> FinancialInstrumentAttributes97.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails82
	 * SecuritiesTradeDetails82}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails82> forSecuritiesTradeDetails82 = new MMConstraint<SecuritiesTradeDetails82>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails82;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails82.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails83
	 * SecuritiesTradeDetails83}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails83> forSecuritiesTradeDetails83 = new MMConstraint<SecuritiesTradeDetails83>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails83;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails83.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86
	 * SecuritiesTradeDetails86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails86> forSecuritiesTradeDetails86 = new MMConstraint<SecuritiesTradeDetails86>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails86;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails86.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87
	 * SecuritiesTradeDetails87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails87> forSecuritiesTradeDetails87 = new MMConstraint<SecuritiesTradeDetails87>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails87;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails87.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88
	 * SecuritiesTradeDetails88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails88> forSecuritiesTradeDetails88 = new MMConstraint<SecuritiesTradeDetails88>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails88;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails88.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89
	 * SecuritiesTradeDetails89}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails89> forSecuritiesTradeDetails89 = new MMConstraint<SecuritiesTradeDetails89>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails89;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails89.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90
	 * SecuritiesTradeDetails90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails90> forSecuritiesTradeDetails90 = new MMConstraint<SecuritiesTradeDetails90>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkSecuritiesTradeDetails90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails90.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111
	 * TransactionDetails111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails111> forTransactionDetails111 = new MMConstraint<TransactionDetails111>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails111;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails111.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112
	 * TransactionDetails112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails112> forTransactionDetails112 = new MMConstraint<TransactionDetails112>() {
		{
			validator = ConstraintAdditionalDetailsRule::checkTransactionDetails112;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails112.mmObject();
		}
	};

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails25(SecuritiesTradeDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes8(FinancialInstrumentAttributes8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes20(FinancialInstrumentAttributes20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes35(FinancialInstrumentAttributes35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * DeclarationlDetails and/or PartyContactDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkPartyTextInformation2(PartyTextInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails26(SecuritiesTradeDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails27(SecuritiesTradeDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes41(FinancialInstrumentAttributes41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * DeclarationlDetails and/or PartyContactDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkPartyTextInformation4(PartyTextInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails28(SecuritiesTradeDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes4(FinancialInstrumentAttributes4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails2(IntraPositionDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes13(FinancialInstrumentAttributes13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails8(IntraPositionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes21(FinancialInstrumentAttributes21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails12(IntraPositionDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes26(FinancialInstrumentAttributes26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails13(IntraPositionDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes36(FinancialInstrumentAttributes36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails22(IntraPositionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes42(FinancialInstrumentAttributes42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails26(IntraPositionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails27(IntraPositionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails29(IntraPositionDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails1(IntraPositionMovementDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails2(IntraPositionMovementDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails5(IntraPositionMovementDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes27(FinancialInstrumentAttributes27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails6(IntraPositionMovementDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails7(IntraPositionMovementDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails8(IntraPositionMovementDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails9(IntraPositionMovementDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails10(IntraPositionMovementDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes14(FinancialInstrumentAttributes14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes30(FinancialInstrumentAttributes30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails6(SecuritiesTradeDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails13(SecuritiesTradeDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes28(FinancialInstrumentAttributes28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails3(SecuritiesTradeDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails11(SecuritiesTradeDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails2(SecuritiesTradeDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails16(SecuritiesTradeDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails1(SecuritiesTradeDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails15(SecuritiesTradeDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails7(TransactionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails8(TransactionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails16(TransactionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails17(TransactionDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails26(TransactionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails25(TransactionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails27(TransactionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails33(TransactionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails39(TransactionDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails50(TransactionDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails56(TransactionDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails59(TransactionDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails6(TransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails18(TransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails24(TransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails34(TransactionDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails37(TransactionDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails48(TransactionDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails57(TransactionDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails60(TransactionDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes31(FinancialInstrumentAttributes31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes44(FinancialInstrumentAttributes44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails1(IntraPositionDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails11(IntraPositionDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails5(SecuritiesTradeDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails2(SecuritiesFinancingTransactionDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails8(SecuritiesFinancingTransactionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes15(FinancialInstrumentAttributes15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails12(SecuritiesTradeDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails6(SecuritiesFinancingTransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails10(SecuritiesFinancingTransactionDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails17(SecuritiesFinancingTransactionDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails18(SecuritiesFinancingTransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes29(FinancialInstrumentAttributes29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails7(IntraPositionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails16(IntraPositionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails21(IntraPositionDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails25(IntraPositionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails3(IntraPositionMovementDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails4(IntraPositionMovementDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the sender and the receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraBalance1(IntraBalance1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the sender and receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails51(TransactionDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver,
	 * FinancialInstrumentAttributeAdditionalDetails must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes2(FinancialInstrumentAttributes2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails21(SecuritiesFinancingTransactionDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails62(TransactionDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails63(TransactionDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails31(SecuritiesTradeDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails33(SecuritiesTradeDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails38(SecuritiesTradeDetails38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails37(SecuritiesTradeDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails34(SecuritiesTradeDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails32(SecuritiesTradeDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails44(SecuritiesTradeDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails39(SecuritiesTradeDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails43(SecuritiesTradeDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails22(SecuritiesFinancingTransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails40(SecuritiesTradeDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails67(TransactionDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails68(TransactionDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails46(SecuritiesTradeDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails47(SecuritiesTradeDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails24(SecuritiesFinancingTransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails69(TransactionDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails25(SecuritiesFinancingTransactionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails72(TransactionDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails26(SecuritiesFinancingTransactionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails75(TransactionDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails78(TransactionDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes63(FinancialInstrumentAttributes63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails33(IntraPositionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes64(FinancialInstrumentAttributes64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails51(SecuritiesTradeDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails53(SecuritiesTradeDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails55(SecuritiesTradeDetails55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails56(SecuritiesTradeDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails34(IntraPositionDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails52(SecuritiesTradeDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails11(IntraPositionMovementDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails50(SecuritiesTradeDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails59(SecuritiesTradeDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails33(SecuritiesFinancingTransactionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails58(SecuritiesTradeDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes75(FinancialInstrumentAttributes75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails35(IntraPositionDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails63(SecuritiesTradeDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails36(IntraPositionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails62(SecuritiesTradeDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes78(FinancialInstrumentAttributes78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails91(TransactionDetails91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails90(TransactionDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails12(IntraPositionMovementDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails65(SecuritiesTradeDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails66(SecuritiesTradeDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the sender and the receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraBalance3(IntraBalance3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the sender and receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails93(TransactionDetails93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails41(IntraPositionDetails41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails67(SecuritiesTradeDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails35(SecuritiesFinancingTransactionDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails96(TransactionDetails96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails13(IntraPositionMovementDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails95(TransactionDetails95 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails43(IntraPositionDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails70(SecuritiesTradeDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails36(SecuritiesFinancingTransactionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails14(IntraPositionMovementDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails99(TransactionDetails99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails98(TransactionDetails98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the sender and receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails102(TransactionDetails102 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails46(IntraPositionDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails104(TransactionDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails103(TransactionDetails103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails15(IntraPositionMovementDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails73(SecuritiesTradeDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails74(SecuritiesTradeDetails74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails75(SecuritiesTradeDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails76(SecuritiesTradeDetails76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails77(SecuritiesTradeDetails77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails78(SecuritiesTradeDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails79(SecuritiesTradeDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes91(FinancialInstrumentAttributes91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes92(FinancialInstrumentAttributes92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes95(FinancialInstrumentAttributes95 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails47(IntraPositionDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails16(IntraPositionMovementDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes97(FinancialInstrumentAttributes97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails82(SecuritiesTradeDetails82 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails83(SecuritiesTradeDetails83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails86(SecuritiesTradeDetails86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails87(SecuritiesTradeDetails87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails88(SecuritiesTradeDetails88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails89(SecuritiesTradeDetails89 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails90(SecuritiesTradeDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails111(TransactionDetails111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails112(TransactionDetails112 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
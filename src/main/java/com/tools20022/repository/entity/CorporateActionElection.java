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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ElectionMovementTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.msg.CorporateActionElection1;
import com.tools20022.repository.msg.CorporateActionElection2;
import com.tools20022.repository.msg.CorporateActionElection3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decision taken by the account holder regarding the corporate action event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionElection"
 * src="doc-files/CorporateActionElection.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#ExecutionRequestedDateTime
 * CorporateActionElection.ExecutionRequestedDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Option
 * CorporateActionElection.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#CashAccount
 * CorporateActionElection.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#ElectionType
 * CorporateActionElection.ElectionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Quantity
 * CorporateActionElection.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#AmendmentReason
 * CorporateActionElection.AmendmentReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#RelatedServicing
 * CorporateActionElection.RelatedServicing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCorporateActionElection
 * CashAccount.RelatedCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionElection
 * SecuritiesQuantity.CorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#CorporateActionElection
 * CorporateActionOption.CorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionElection
 * CorporateActionServicing.CorporateActionElection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionElection3
 * CorporateActionElection3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionElection1
 * CorporateActionElection1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionElection2
 * CorporateActionElection2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionElection"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decision taken by the account holder regarding the corporate action event."</li>
 * </ul>
 */
public class CorporateActionElection {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date/time at which the instructing party requests the instruction to be
	 * executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#ExecutionRequestedDateTime
	 * CorporateActionOption5.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#ExecutionRequestedDateTime
	 * CorporateActionOption13.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#ExecutionRequestedDateTime
	 * CorporateActionOption25.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#ExecutionRequestedDateTime
	 * CorporateActionOption30.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#ExecutionRequestedDateTime
	 * CorporateActionOption38.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#ExecutionRequestedDateTime
	 * CorporateActionOption47.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#ExecutionRequestedDateTime
	 * CorporateActionOption57.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#ExecutionRequestedDateTime
	 * CorporateActionOption58.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#ExecutionRequestedDateTime
	 * CorporateActionOption103.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#ExecutionRequestedDateTime
	 * CorporateActionOption107.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#ExecutionRequestedDateTime
	 * CorporateActionOption118.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#ExecutionRequestedDateTime
	 * CorporateActionOption123.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#ExecutionRequestedDateTime
	 * CorporateActionOption131.ExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#ExecutionRequestedDateTime
	 * CorporateActionOption134.ExecutionRequestedDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionRequestedDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the instructing party requests the instruction to be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExecutionRequestedDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption5.ExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption13.ExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption25.ExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption30.ExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption38.ExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption47.ExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption57.ExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption58.ExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption103.ExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption107.ExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption118.ExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption123.ExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption131.ExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption134.ExecutionRequestedDateTime);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionRequestedDateTime";
			definition = "Date/time at which the instructing party requests the instruction to be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Option on which the investor makes its decision.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#CorporateActionElection
	 * CorporateActionOption.CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option on which the investor makes its decision."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Option = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option on which the investor makes its decision.";
			minOccurs = 1;
			type_lazy = () -> CorporateActionOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.CorporateActionElection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the account(s) used in relation with the election of an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCorporateActionElection
	 * CashAccount.RelatedCorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption2#Account
	 * CashOption2.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption9#Account
	 * CashOption9.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#Account
	 * CashOption12.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#Account
	 * CashOption13.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#Account
	 * CashOption18.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#Account
	 * CashOption22.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#Account
	 * CashOption26.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#Account
	 * CashOption27.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption5#Account
	 * CashOption5.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption7#Account
	 * CashOption7.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption19#Account
	 * CashOption19.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption23#Account
	 * CashOption23.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#Account
	 * CashOption30.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#Account
	 * CashOption38.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#Account
	 * CashOption39.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#Account
	 * CashOption41.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#Account
	 * CashOption44.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption45#Account
	 * CashOption45.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#Account
	 * CashOption46.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption48#Account
	 * CashOption48.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#Account
	 * CashOption52.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#Account
	 * CashOption55.Account}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account(s) used in relation with the election of an option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption2.Account, com.tools20022.repository.msg.CashOption9.Account, com.tools20022.repository.msg.CashOption12.Account,
					com.tools20022.repository.msg.CashOption13.Account, com.tools20022.repository.msg.CashOption18.Account, com.tools20022.repository.msg.CashOption22.Account, com.tools20022.repository.msg.CashOption26.Account,
					com.tools20022.repository.msg.CashOption27.Account, com.tools20022.repository.msg.CashOption5.Account, com.tools20022.repository.msg.CashOption7.Account, com.tools20022.repository.msg.CashOption19.Account,
					com.tools20022.repository.msg.CashOption23.Account, com.tools20022.repository.msg.CashOption30.Account, com.tools20022.repository.msg.CashOption38.Account, com.tools20022.repository.msg.CashOption39.Account,
					com.tools20022.repository.msg.CashOption41.Account, com.tools20022.repository.msg.CashOption44.Account, com.tools20022.repository.msg.CashOption45.Account, com.tools20022.repository.msg.CashOption46.Account,
					com.tools20022.repository.msg.CashOption48.Account, com.tools20022.repository.msg.CashOption52.Account, com.tools20022.repository.msg.CashOption55.Account);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Specifies the account(s) used in relation with the election of an option.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedCorporateActionElection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the election results in a change of balance type that
	 * transfers control of the underlying securities or the transfer of
	 * underlying securities themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode
	 * ElectionMovementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat1Choice#Code
	 * ElectionTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat1Choice#Proprietary
	 * ElectionTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#ElectionType
	 * CorporateAction3.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat2Choice#Code
	 * ElectionTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat2Choice#Proprietary
	 * ElectionTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#ElectionType
	 * CorporateAction4.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#ElectionType
	 * CorporateAction5.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#ElectionType
	 * CorporateAction6.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#ElectionType
	 * CorporateAction7.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#ElectionType
	 * CorporateAction8.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#ElectionType
	 * CorporateAction10.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#ElectionType
	 * CorporateAction11.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#ElectionType
	 * CorporateAction2.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#ElectionType
	 * CorporateAction12.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#ElectionType
	 * CorporateAction17.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#ElectionType
	 * CorporateAction31.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat3Choice#Code
	 * ElectionTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat3Choice#Proprietary
	 * ElectionTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#ElectionType
	 * CorporateAction40.ElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat4Choice#Code
	 * ElectionTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat4Choice#Proprietary
	 * ElectionTypeFormat4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the election results in a change of balance type that transfers control of the underlying securities or the transfer of underlying securities themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ElectionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ElectionTypeFormat1Choice.Code, com.tools20022.repository.choice.ElectionTypeFormat1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction3.ElectionType, com.tools20022.repository.choice.ElectionTypeFormat2Choice.Code, com.tools20022.repository.choice.ElectionTypeFormat2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction4.ElectionType, com.tools20022.repository.msg.CorporateAction5.ElectionType, com.tools20022.repository.msg.CorporateAction6.ElectionType,
					com.tools20022.repository.msg.CorporateAction7.ElectionType, com.tools20022.repository.msg.CorporateAction8.ElectionType, com.tools20022.repository.msg.CorporateAction10.ElectionType,
					com.tools20022.repository.msg.CorporateAction11.ElectionType, com.tools20022.repository.msg.CorporateAction2.ElectionType, com.tools20022.repository.msg.CorporateAction12.ElectionType,
					com.tools20022.repository.msg.CorporateAction17.ElectionType, com.tools20022.repository.msg.CorporateAction31.ElectionType, com.tools20022.repository.choice.ElectionTypeFormat3Choice.Code,
					com.tools20022.repository.choice.ElectionTypeFormat3Choice.Proprietary, com.tools20022.repository.msg.CorporateAction40.ElectionType, com.tools20022.repository.choice.ElectionTypeFormat4Choice.Code,
					com.tools20022.repository.choice.ElectionTypeFormat4Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectionType";
			definition = "Specifies whether the election results in a change of balance type that transfers control of the underlying securities or the transfer of underlying securities themselves.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ElectionMovementTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the quantity of securities elected for the associated option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionElection
	 * SecuritiesQuantity.CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#InstructedUnderlyingSecuritiesQuantity
	 * CorporateActionElection3.InstructedUnderlyingSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#InstructedSecuritiesQuantityToReceive
	 * CorporateActionElection3.InstructedSecuritiesQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#OriginalInstructedQuantity
	 * CorporateActionElection1.OriginalInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#RemainingQuantity
	 * CorporateActionElection1.RemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#NewInstructedQuantity
	 * CorporateActionElection2.NewInstructedQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the quantity of securities elected for the associated option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Quantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionElection3.InstructedUnderlyingSecuritiesQuantity, com.tools20022.repository.msg.CorporateActionElection3.InstructedSecuritiesQuantityToReceive,
					com.tools20022.repository.msg.CorporateActionElection1.OriginalInstructedQuantity, com.tools20022.repository.msg.CorporateActionElection1.RemainingQuantity,
					com.tools20022.repository.msg.CorporateActionElection2.NewInstructedQuantity);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of securities elected for the associated option.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionElection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason explaining the amendment of the election.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#Reason
	 * CorporateActionElection2.Reason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason explaining the amendment of the election."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmendmentReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionElection2.Reason);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmendmentReason";
			definition = "Reason explaining the amendment of the election.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionElection
	 * CorporateActionServicing.CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.CorporateActionElection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionElection";
				definition = "Decision taken by the account holder regarding the corporate action event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.RelatedCorporateActionElection, com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.CorporateActionElection, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionElection);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionElection.ExecutionRequestedDateTime, com.tools20022.repository.entity.CorporateActionElection.Option,
						com.tools20022.repository.entity.CorporateActionElection.CashAccount, com.tools20022.repository.entity.CorporateActionElection.ElectionType, com.tools20022.repository.entity.CorporateActionElection.Quantity,
						com.tools20022.repository.entity.CorporateActionElection.AmendmentReason, com.tools20022.repository.entity.CorporateActionElection.RelatedServicing);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionElection3.mmObject(), CorporateActionElection1.mmObject(), CorporateActionElection2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
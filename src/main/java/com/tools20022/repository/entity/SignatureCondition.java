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
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the signature requirements for managing an account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SignatureCondition" src="doc-files/SignatureCondition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#RequiredSignatureNumber
 * SignatureCondition.RequiredSignatureNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#SignatoryRightIndicator
 * SignatureCondition.SignatoryRightIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SignatureCondition#Mandate
 * SignatureCondition.Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#SignatureOrderIndicator
 * SignatureCondition.SignatureOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#SignatureOrder
 * SignatureCondition.SignatureOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#Signature
 * SignatureCondition.Signature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Signature#Conditions
 * Signature.Conditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#SignatureConditions
 * Mandate.SignatureConditions}</li>
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
 * "SignatureCondition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the signature requirements for managing an account."
 * </li>
 * </ul>
 */
public class SignatureCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of account owners or related parties required to authorise
	 * transactions on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#RequiredSignatoriesNumber
	 * InvestmentAccount17.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#RequiredSignatoriesNumber
	 * InvestmentAccount27.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#RequiredSignatoriesNumber
	 * InvestmentAccount35.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#RequiredSignatoriesNumber
	 * InvestmentAccount18.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#RequiredSignatoriesNumber
	 * InvestmentAccount28.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#RequiredSignatoriesNumber
	 * InvestmentAccount36.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#RequiredSignatoriesNumber
	 * InvestmentAccount16.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#RequiredSignatoriesNumber
	 * InvestmentAccount26.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#RequiredSignatoriesNumber
	 * InvestmentAccount34.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#RequiredSignatoriesNumber
	 * InvestmentAccount38.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#RequiredSignatoriesNumber
	 * InvestmentAccount37.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#RequiredSignatoriesNumber
	 * InvestmentAccount39.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#RequiredSignatoriesNumber
	 * InvestmentAccount46.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#RequiredSignatoriesNumber
	 * InvestmentAccount47.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#RequiredSignatoriesNumber
	 * InvestmentAccount49.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#RequiredSignatoriesNumber
	 * InvestmentAccount51.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#RequiredSignatoriesNumber
	 * InvestmentAccount50.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#RequiredSignatoriesNumber
	 * InvestmentAccount61.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#RequiredSignatoriesNumber
	 * InvestmentAccount63.RequiredSignatoriesNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#RequiredSignatoriesNumber
	 * InvestmentAccount62.RequiredSignatoriesNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredSignatureNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of account owners or related parties required to authorise transactions on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequiredSignatureNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount27.RequiredSignatoriesNumber,
					com.tools20022.repository.msg.InvestmentAccount35.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount18.RequiredSignatoriesNumber,
					com.tools20022.repository.msg.InvestmentAccount28.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount36.RequiredSignatoriesNumber,
					com.tools20022.repository.msg.InvestmentAccount16.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount26.RequiredSignatoriesNumber,
					com.tools20022.repository.msg.InvestmentAccount34.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount38.RequiredSignatoriesNumber,
					com.tools20022.repository.msg.InvestmentAccount37.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount39.RequiredSignatoriesNumber,
					com.tools20022.repository.msg.InvestmentAccount46.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount47.RequiredSignatoriesNumber,
					com.tools20022.repository.msg.InvestmentAccount49.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount51.RequiredSignatoriesNumber,
					com.tools20022.repository.msg.InvestmentAccount50.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount61.RequiredSignatoriesNumber,
					com.tools20022.repository.msg.InvestmentAccount63.RequiredSignatoriesNumber, com.tools20022.repository.msg.InvestmentAccount62.RequiredSignatoriesNumber);
			elementContext_lazy = () -> SignatureCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequiredSignatureNumber";
			definition = "Number of account owners or related parties required to authorise transactions on the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates whether the signature of the account owner is required to
	 * authorise transactions on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation5.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation2.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation6.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation3.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation4.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation7.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation8.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation9.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation10.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation11.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation12.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation13.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation15.SignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#SignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation14.SignatoryRightIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatoryRightIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the signature of the account owner is required to authorise transactions on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SignatoryRightIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.SignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.SignatoryRightIndicator,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.SignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.SignatoryRightIndicator,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.SignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.SignatoryRightIndicator,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.SignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.SignatoryRightIndicator,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.SignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.SignatoryRightIndicator,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.SignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.SignatoryRightIndicator,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.SignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.SignatoryRightIndicator);
			elementContext_lazy = () -> SignatureCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the signature of the account owner is required to authorise transactions on the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Mandate for which signature conditions are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#SignatureConditions
	 * Mandate.SignatureConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate for which signature conditions are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Mandate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SignatureCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Mandate for which signature conditions are provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.SignatureConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicator whether a certain order of signatures has to be respected or
	 * not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate1#SignatureOrderIndicator
	 * OperationMandate1.SignatureOrderIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2#SignatureOrderIndicator
	 * OperationMandate2.SignatureOrderIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3#SignatureOrderIndicator
	 * OperationMandate3.SignatureOrderIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator whether a certain order of signatures has to be respected or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SignatureOrderIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OperationMandate1.SignatureOrderIndicator, com.tools20022.repository.msg.OperationMandate2.SignatureOrderIndicator,
					com.tools20022.repository.msg.OperationMandate3.SignatureOrderIndicator);
			elementContext_lazy = () -> SignatureCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureOrderIndicator";
			definition = "Indicator whether a certain order of signatures has to be respected or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates the order in which the mandate holders are allowed to sign.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndCertificate1#SignatureOrder
	 * PartyAndCertificate1.SignatureOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#SignatureOrder
	 * PartyAndAuthorisation1.SignatureOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#SignatureOrder
	 * PartyAndAuthorisation3.SignatureOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the order in which the mandate holders are allowed to sign."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SignatureOrder = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndCertificate1.SignatureOrder, com.tools20022.repository.msg.PartyAndAuthorisation1.SignatureOrder,
					com.tools20022.repository.msg.PartyAndAuthorisation3.SignatureOrder);
			elementContext_lazy = () -> SignatureCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureOrder";
			definition = "Indicates the order in which the mandate holders are allowed to sign.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15PlusSignedNumericText.mmObject();
		}
	};
	/**
	 * Manual or digital signature added as security provision by each party
	 * involved in the business covered by the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Signature#Conditions
	 * Signature.Conditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Signature Signature}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manual or digital signature added as security provision by each party involved in the business covered by the document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Signature = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SignatureCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Signature";
			definition = "Manual or digital signature added as security provision by each party involved in the business covered by the document.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Signature.Conditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SignatureCondition";
				definition = "Specifies the signature requirements for managing an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Signature.Conditions, com.tools20022.repository.entity.Mandate.SignatureConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SignatureCondition.RequiredSignatureNumber, com.tools20022.repository.entity.SignatureCondition.SignatoryRightIndicator,
						com.tools20022.repository.entity.SignatureCondition.Mandate, com.tools20022.repository.entity.SignatureCondition.SignatureOrderIndicator, com.tools20022.repository.entity.SignatureCondition.SignatureOrder,
						com.tools20022.repository.entity.SignatureCondition.Signature);
			}
		});
		return mmObject_lazy.get();
	}
}
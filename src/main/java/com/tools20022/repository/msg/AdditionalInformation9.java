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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentificationAndAccount43;
import com.tools20022.repository.msg.SecuritiesAccount13;
import com.tools20022.repository.msg.SecurityIdentification14;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional specific modification criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmAccountOwnerTransactionIdentification
 * AdditionalInformation9.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmClassificationType
 * AdditionalInformation9.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmSafekeepingAccount
 * AdditionalInformation9.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmFinancialInstrumentIdentification
 * AdditionalInformation9.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmQuantity
 * AdditionalInformation9.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmEffectiveDate
 * AdditionalInformation9.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmExpiryDate
 * AdditionalInformation9.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmCutOffDate
 * AdditionalInformation9.mmCutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmInvestor
 * AdditionalInformation9.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmDeliveringParty1
 * AdditionalInformation9.mmDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmReceivingParty1
 * AdditionalInformation9.mmReceivingParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmProcessingStatus
 * AdditionalInformation9.mmProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#mmAdditionalInformation
 * SecuritiesSettlementConditionsModificationRequestV05.mmAdditionalInformation}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityRule#forAdditionalInformation9
 * ConstraintQuantityRule.forAdditionalInformation9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPartyRule#forAdditionalInformation9
 * ConstraintPartyRule.forAdditionalInformation9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forAdditionalInformation9
 * ConstraintCoexistenceIdentificationRule.forAdditionalInformation9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forAdditionalInformation9
 * ConstraintCoexistenceQuantityRule.forAdditionalInformation9}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalInformation9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional specific modification criteria."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalInformation11
 * AdditionalInformation11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7
 * AdditionalInformation7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalInformation9", propOrder = {"accountOwnerTransactionIdentification", "classificationType", "safekeepingAccount", "financialInstrumentIdentification", "quantity", "effectiveDate", "expiryDate", "cutOffDate",
		"investor", "deliveringParty1", "receivingParty1", "processingStatus"})
public class AdditionalInformation9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnrTxId")
	protected Max35Text accountOwnerTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountOwnerTransactionIdentification
	 * Entry.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction as known by the account owner. Will be used in a unilateral split to provide the executing party with the account owner identification of each split transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation11.mmAccountOwnerTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation7.mmAccountOwnerTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalInformation9, Optional<Max35Text>> mmAccountOwnerTransactionIdentification = new MMMessageAttribute<AdditionalInformation9, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountOwnerTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Identification of the transaction as known by the account owner. Will be used in a unilateral split to provide the executing party with the account owner identification of each split transaction.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmAccountOwnerTransactionIdentification);
			previousVersion_lazy = () -> AdditionalInformation7.mmAccountOwnerTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalInformation9 obj) {
			return obj.getAccountOwnerTransactionIdentification();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<Max35Text> value) {
			obj.setAccountOwnerTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClssfctnTp")
	protected ClassificationType1Choice classificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClassificationType1Choice
	 * ClassificationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
	 * Asset.mmAssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of instrument involved in the transactions on which the modification request should apply."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmClassificationType
	 * AdditionalInformation11.mmClassificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmClassificationType
	 * AdditionalInformation7.mmClassificationType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<ClassificationType1Choice>> mmClassificationType = new MMMessageAssociationEnd<AdditionalInformation9, Optional<ClassificationType1Choice>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Type of instrument involved in the transactions on which the modification request should apply.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmClassificationType);
			previousVersion_lazy = () -> AdditionalInformation7.mmClassificationType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClassificationType1Choice.mmObject();
		}

		@Override
		public Optional<ClassificationType1Choice> getValue(AdditionalInformation9 obj) {
			return obj.getClassificationType();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<ClassificationType1Choice> value) {
			obj.setClassificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmSafekeepingAccount
	 * AdditionalInformation11.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmSafekeepingAccount
	 * AdditionalInformation7.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<SecuritiesAccount13>> mmSafekeepingAccount = new MMMessageAssociationEnd<AdditionalInformation9, Optional<SecuritiesAccount13>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmSafekeepingAccount);
			previousVersion_lazy = () -> AdditionalInformation7.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount13> getValue(AdditionalInformation9 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<SecuritiesAccount13> value) {
			obj.setSafekeepingAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the financial instrument involved in the transactions on which the modification request should apply."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmFinancialInstrumentIdentification
	 * AdditionalInformation11.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmFinancialInstrumentIdentification
	 * AdditionalInformation7.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<SecurityIdentification14>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<AdditionalInformation9, Optional<SecurityIdentification14>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of the financial instrument involved in the transactions on which the modification request should apply.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> AdditionalInformation7.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public Optional<SecurityIdentification14> getValue(AdditionalInformation9 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<SecurityIdentification14> value) {
			obj.setFinancialInstrumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Qty")
	protected FinancialInstrumentQuantity1Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument concerned by the settlement condition modification request."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmQuantity
	 * AdditionalInformation11.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmQuantity
	 * AdditionalInformation7.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<FinancialInstrumentQuantity1Choice>> mmQuantity = new MMMessageAssociationEnd<AdditionalInformation9, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of financial instrument concerned by the settlement condition modification request.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmQuantity);
			previousVersion_lazy = () -> AdditionalInformation7.mmQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(AdditionalInformation9 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvDt")
	protected DateAndDateTimeChoice effectiveDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time when the request should take effect."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmEffectiveDate
	 * AdditionalInformation11.mmEffectiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmEffectiveDate
	 * AdditionalInformation7.mmEffectiveDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<DateAndDateTimeChoice>> mmEffectiveDate = new MMMessageAssociationEnd<AdditionalInformation9, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time when the request should take effect.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmEffectiveDate);
			previousVersion_lazy = () -> AdditionalInformation7.mmEffectiveDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(AdditionalInformation9 obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setEffectiveDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
	protected DateAndDateTimeChoice expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time when the request should cease to be in effect."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmExpiryDate
	 * AdditionalInformation11.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmExpiryDate
	 * AdditionalInformation7.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<DateAndDateTimeChoice>> mmExpiryDate = new MMMessageAssociationEnd<AdditionalInformation9, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date/time when the request should cease to be in effect.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmExpiryDate);
			previousVersion_lazy = () -> AdditionalInformation7.mmExpiryDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(AdditionalInformation9 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CutOffDt")
	protected DateAndDateTimeChoice cutOffDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CutOffDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time of the release."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmCutOffDate
	 * AdditionalInformation11.mmCutOffDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmCutOffDate
	 * AdditionalInformation7.mmCutOffDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<DateAndDateTimeChoice>> mmCutOffDate = new MMMessageAssociationEnd<AdditionalInformation9, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "CutOffDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffDate";
			definition = "Date/time of the release.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmCutOffDate);
			previousVersion_lazy = () -> AdditionalInformation7.mmCutOffDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(AdditionalInformation9 obj) {
			return obj.getCutOffDate();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setCutOffDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Invstr")
	protected PartyIdentification43Choice investor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
	 * PartyIdentification43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, either an individual or organisation, whose assets are being invested."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmInvestor
	 * AdditionalInformation11.mmInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmInvestor
	 * AdditionalInformation7.mmInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<PartyIdentification43Choice>> mmInvestor = new MMMessageAssociationEnd<AdditionalInformation9, Optional<PartyIdentification43Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmInvestor);
			previousVersion_lazy = () -> AdditionalInformation7.mmInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification43Choice> getValue(AdditionalInformation9 obj) {
			return obj.getInvestor();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<PartyIdentification43Choice> value) {
			obj.setInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgPty1")
	protected PartyIdentificationAndAccount43 deliveringParty1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount43
	 * PartyIdentificationAndAccount43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgPty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringParty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the depository."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmDeliveringParty1
	 * AdditionalInformation11.mmDeliveringParty1}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmDeliveringParty1
	 * AdditionalInformation7.mmDeliveringParty1}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<PartyIdentificationAndAccount43>> mmDeliveringParty1 = new MMMessageAssociationEnd<AdditionalInformation9, Optional<PartyIdentificationAndAccount43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "DlvrgPty1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringParty1";
			definition = "Party that, in a settlement chain interacts with the depository.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmDeliveringParty1);
			previousVersion_lazy = () -> AdditionalInformation7.mmDeliveringParty1;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount43.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount43> getValue(AdditionalInformation9 obj) {
			return obj.getDeliveringParty1();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<PartyIdentificationAndAccount43> value) {
			obj.setDeliveringParty1(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgPty1")
	protected PartyIdentificationAndAccount43 receivingParty1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount43
	 * PartyIdentificationAndAccount43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgPty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingParty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the depository."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmReceivingParty1
	 * AdditionalInformation11.mmReceivingParty1}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmReceivingParty1
	 * AdditionalInformation7.mmReceivingParty1}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<PartyIdentificationAndAccount43>> mmReceivingParty1 = new MMMessageAssociationEnd<AdditionalInformation9, Optional<PartyIdentificationAndAccount43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "RcvgPty1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingParty1";
			definition = "Party that, in a settlement chain interacts with the depository.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmReceivingParty1);
			previousVersion_lazy = () -> AdditionalInformation7.mmReceivingParty1;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount43.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount43> getValue(AdditionalInformation9 obj) {
			return obj.getReceivingParty1();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<PartyIdentificationAndAccount43> value) {
			obj.setReceivingParty1(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus39Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus39Choice
	 * ProcessingStatus39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the processing status of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmProcessingStatus
	 * AdditionalInformation11.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalInformation9, Optional<ProcessingStatus39Choice>> mmProcessingStatus = new MMMessageAssociationEnd<AdditionalInformation9, Optional<ProcessingStatus39Choice>>() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation9.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmProcessingStatus);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus39Choice.mmObject();
		}

		@Override
		public Optional<ProcessingStatus39Choice> getValue(AdditionalInformation9 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(AdditionalInformation9 obj, Optional<ProcessingStatus39Choice> value) {
			obj.setProcessingStatus(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalInformation9.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation9.mmClassificationType,
						com.tools20022.repository.msg.AdditionalInformation9.mmSafekeepingAccount, com.tools20022.repository.msg.AdditionalInformation9.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.AdditionalInformation9.mmQuantity, com.tools20022.repository.msg.AdditionalInformation9.mmEffectiveDate, com.tools20022.repository.msg.AdditionalInformation9.mmExpiryDate,
						com.tools20022.repository.msg.AdditionalInformation9.mmCutOffDate, com.tools20022.repository.msg.AdditionalInformation9.mmInvestor, com.tools20022.repository.msg.AdditionalInformation9.mmDeliveringParty1,
						com.tools20022.repository.msg.AdditionalInformation9.mmReceivingParty1, com.tools20022.repository.msg.AdditionalInformation9.mmProcessingStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementConditionsModificationRequestV05.mmAdditionalInformation);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintQuantityRule.forAdditionalInformation9, com.tools20022.repository.constraints.ConstraintPartyRule.forAdditionalInformation9,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forAdditionalInformation9, com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forAdditionalInformation9);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AdditionalInformation9";
				definition = "Additional specific modification criteria.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalInformation11.mmObject());
				previousVersion_lazy = () -> AdditionalInformation7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getAccountOwnerTransactionIdentification() {
		return accountOwnerTransactionIdentification == null ? Optional.empty() : Optional.of(accountOwnerTransactionIdentification);
	}

	public AdditionalInformation9 setAccountOwnerTransactionIdentification(Max35Text accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = accountOwnerTransactionIdentification;
		return this;
	}

	public Optional<ClassificationType1Choice> getClassificationType() {
		return classificationType == null ? Optional.empty() : Optional.of(classificationType);
	}

	public AdditionalInformation9 setClassificationType(ClassificationType1Choice classificationType) {
		this.classificationType = classificationType;
		return this;
	}

	public Optional<SecuritiesAccount13> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public AdditionalInformation9 setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}

	public Optional<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public AdditionalInformation9 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getQuantity() {
		return quantity == null ? Optional.empty() : Optional.of(quantity);
	}

	public AdditionalInformation9 setQuantity(FinancialInstrumentQuantity1Choice quantity) {
		this.quantity = quantity;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getEffectiveDate() {
		return effectiveDate == null ? Optional.empty() : Optional.of(effectiveDate);
	}

	public AdditionalInformation9 setEffectiveDate(DateAndDateTimeChoice effectiveDate) {
		this.effectiveDate = effectiveDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public AdditionalInformation9 setExpiryDate(DateAndDateTimeChoice expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getCutOffDate() {
		return cutOffDate == null ? Optional.empty() : Optional.of(cutOffDate);
	}

	public AdditionalInformation9 setCutOffDate(DateAndDateTimeChoice cutOffDate) {
		this.cutOffDate = cutOffDate;
		return this;
	}

	public Optional<PartyIdentification43Choice> getInvestor() {
		return investor == null ? Optional.empty() : Optional.of(investor);
	}

	public AdditionalInformation9 setInvestor(PartyIdentification43Choice investor) {
		this.investor = investor;
		return this;
	}

	public Optional<PartyIdentificationAndAccount43> getDeliveringParty1() {
		return deliveringParty1 == null ? Optional.empty() : Optional.of(deliveringParty1);
	}

	public AdditionalInformation9 setDeliveringParty1(PartyIdentificationAndAccount43 deliveringParty1) {
		this.deliveringParty1 = deliveringParty1;
		return this;
	}

	public Optional<PartyIdentificationAndAccount43> getReceivingParty1() {
		return receivingParty1 == null ? Optional.empty() : Optional.of(receivingParty1);
	}

	public AdditionalInformation9 setReceivingParty1(PartyIdentificationAndAccount43 receivingParty1) {
		this.receivingParty1 = receivingParty1;
		return this;
	}

	public Optional<ProcessingStatus39Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public AdditionalInformation9 setProcessingStatus(ProcessingStatus39Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}
}
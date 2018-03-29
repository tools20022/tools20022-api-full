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
import com.tools20022.repository.area.pain.MandateInitiationRequestV01;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information that serves as a basis to debit an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmMandateIdentification
 * MandateInformation2.mmMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmMandateRequestIdentification
 * MandateInformation2.mmMandateRequestIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation2#mmType
 * MandateInformation2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmOccurrences
 * MandateInformation2.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmCollectionAmount
 * MandateInformation2.mmCollectionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmMaximumAmount
 * MandateInformation2.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmCreditorSchemeIdentification
 * MandateInformation2.mmCreditorSchemeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation2#mmCreditor
 * MandateInformation2.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmCreditorAccount
 * MandateInformation2.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmCreditorAgent
 * MandateInformation2.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmUltimateCreditor
 * MandateInformation2.mmUltimateCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation2#mmDebtor
 * MandateInformation2.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmDebtorAccount
 * MandateInformation2.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmDebtorAgent
 * MandateInformation2.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmUltimateDebtor
 * MandateInformation2.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmReferredDocument
 * MandateInformation2.mmReferredDocument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV01#mmMandate
 * MandateInitiationRequestV01.mmMandate}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forMandateInformation2
 * ConstraintUltimateDebtorGuideline.forMandateInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandateInformation2
 * ConstraintUltimateCreditorGuideline.forMandateInformation2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information that serves as a basis to debit an account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateInformation2", propOrder = {"mandateIdentification", "mandateRequestIdentification", "type", "occurrences", "collectionAmount", "maximumAmount", "creditorSchemeIdentification", "creditor", "creditorAccount",
		"creditorAgent", "ultimateCreditor", "debtor", "debtorAccount", "debtorAgent", "ultimateDebtor", "referredDocument"})
public class MandateInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MndtId")
	protected Max35Text mandateIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the creditor, to unambiguously identify the mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateInformation2, Optional<Max35Text>> mmMandateIdentification = new MMMessageAttribute<MandateInformation2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MandateInformation2 obj) {
			return obj.getMandateIdentification();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<Max35Text> value) {
			obj.setMandateIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MndtReqId", required = true)
	protected Max35Text mandateRequestIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification for the mandate request, as assigned by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateInformation2, Max35Text> mmMandateRequestIdentification = new MMMessageAttribute<MandateInformation2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "MndtReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateRequestIdentification";
			definition = "Identification for the mandate request, as assigned by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MandateInformation2 obj) {
			return obj.getMandateRequestIdentification();
		}

		@Override
		public void setValue(MandateInformation2 obj, Max35Text value) {
			obj.setMandateRequestIdentification(value);
		}
	};
	@XmlElement(name = "Tp")
	protected MandateTypeInformation1 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation1
	 * MandateTypeInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of mandate, such as paper, electronic or scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, Optional<MandateTypeInformation1>> mmType = new MMMessageAssociationEnd<MandateInformation2, Optional<MandateTypeInformation1>>() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of mandate, such as paper, electronic or scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateTypeInformation1.mmObject();
		}

		@Override
		public Optional<MandateTypeInformation1> getValue(MandateInformation2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<MandateTypeInformation1> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Ocrncs")
	protected MandateOccurrences1 occurrences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MandateOccurrences1
	 * MandateOccurrences1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ocrncs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Occurrences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details of the duration of the mandate and occurrence of the underlying transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, Optional<MandateOccurrences1>> mmOccurrences = new MMMessageAssociationEnd<MandateInformation2, Optional<MandateOccurrences1>>() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "Ocrncs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Occurrences";
			definition = "Set of elements used to provide details of the duration of the mandate and occurrence of the underlying transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateOccurrences1.mmObject();
		}

		@Override
		public Optional<MandateOccurrences1> getValue(MandateInformation2 obj) {
			return obj.getOccurrences();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<MandateOccurrences1> value) {
			obj.setOccurrences(value.orElse(null));
		}
	};
	@XmlElement(name = "ColltnAmt")
	protected ActiveCurrencyAndAmount collectionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmCollectionAmount
	 * DirectDebitMandate.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ColltnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fixed amount to be collected from the debtor's account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateInformation2, Optional<ActiveCurrencyAndAmount>> mmCollectionAmount = new MMMessageAttribute<MandateInformation2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmCollectionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "ColltnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionAmount";
			definition = "Fixed amount to be collected from the debtor's account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MandateInformation2 obj) {
			return obj.getCollectionAmount();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCollectionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxAmt")
	protected ActiveCurrencyAndAmount maximumAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMaximumAmount
	 * DirectDebitMandate.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that may be collected from the debtor's account, per instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateInformation2, Optional<ActiveCurrencyAndAmount>> mmMaximumAmount = new MMMessageAttribute<MandateInformation2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "MaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MandateInformation2 obj) {
			return obj.getMaximumAmount();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setMaximumAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrSchmeId")
	protected PartyIdentification32 creditorSchemeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrSchmeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit party that signs the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, Optional<PartyIdentification32>> mmCreditorSchemeIdentification = new MMMessageAssociationEnd<MandateInformation2, Optional<PartyIdentification32>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "CdtrSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSchemeIdentification";
			definition = "Credit party that signs the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification32.mmObject();
		}

		@Override
		public Optional<PartyIdentification32> getValue(MandateInformation2 obj) {
			return obj.getCreditorSchemeIdentification();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<PartyIdentification32> value) {
			obj.setCreditorSchemeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdtr", required = true)
	protected PartyIdentification32 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that signs the mandate and to whom an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, PartyIdentification32> mmCreditor = new MMMessageAssociationEnd<MandateInformation2, PartyIdentification32>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party that signs the mandate and to whom an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification32.mmObject();
		}

		@Override
		public PartyIdentification32 getValue(MandateInformation2 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(MandateInformation2 obj, PartyIdentification32 value) {
			obj.setCreditor(value);
		}
	};
	@XmlElement(name = "CdtrAcct")
	protected CashAccount16 creditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, Optional<CashAccount16>> mmCreditorAccount = new MMMessageAssociationEnd<MandateInformation2, Optional<CashAccount16>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount16.mmObject();
		}

		@Override
		public Optional<CashAccount16> getValue(MandateInformation2 obj) {
			return obj.getCreditorAccount();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<CashAccount16> value) {
			obj.setCreditorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgt")
	protected BranchAndFinancialInstitutionIdentification4 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, Optional<BranchAndFinancialInstitutionIdentification4>> mmCreditorAgent = new MMMessageAssociationEnd<MandateInformation2, Optional<BranchAndFinancialInstitutionIdentification4>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification4> getValue(MandateInformation2 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<BranchAndFinancialInstitutionIdentification4> value) {
			obj.setCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "UltmtCdtr")
	protected PartyIdentification32 ultimateCreditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtCdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ultimate party to which an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, Optional<PartyIdentification32>> mmUltimateCreditor = new MMMessageAssociationEnd<MandateInformation2, Optional<PartyIdentification32>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification32.mmObject();
		}

		@Override
		public Optional<PartyIdentification32> getValue(MandateInformation2 obj) {
			return obj.getUltimateCreditor();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<PartyIdentification32> value) {
			obj.setUltimateCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "Dbtr", required = true)
	protected PartyIdentification32 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that signs the mandate and owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, PartyIdentification32> mmDebtor = new MMMessageAssociationEnd<MandateInformation2, PartyIdentification32>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that signs the mandate and owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification32.mmObject();
		}

		@Override
		public PartyIdentification32 getValue(MandateInformation2 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(MandateInformation2 obj, PartyIdentification32 value) {
			obj.setDebtor(value);
		}
	};
	@XmlElement(name = "DbtrAcct")
	protected CashAccount16 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor, to which a debit entry will be made as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, Optional<CashAccount16>> mmDebtorAccount = new MMMessageAssociationEnd<MandateInformation2, Optional<CashAccount16>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor, to which a debit entry will be made as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount16.mmObject();
		}

		@Override
		public Optional<CashAccount16> getValue(MandateInformation2 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<CashAccount16> value) {
			obj.setDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgt", required = true)
	protected BranchAndFinancialInstitutionIdentification4 debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, BranchAndFinancialInstitutionIdentification4> mmDebtorAgent = new MMMessageAssociationEnd<MandateInformation2, BranchAndFinancialInstitutionIdentification4>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification4 getValue(MandateInformation2 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(MandateInformation2 obj, BranchAndFinancialInstitutionIdentification4 value) {
			obj.setDebtorAgent(value);
		}
	};
	@XmlElement(name = "UltmtDbtr")
	protected PartyIdentification32 ultimateDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, Optional<PartyIdentification32>> mmUltimateDebtor = new MMMessageAssociationEnd<MandateInformation2, Optional<PartyIdentification32>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification32.mmObject();
		}

		@Override
		public Optional<PartyIdentification32> getValue(MandateInformation2 obj) {
			return obj.getUltimateDebtor();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<PartyIdentification32> value) {
			obj.setUltimateDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "RfrdDoc")
	protected ReferredDocumentInformation3 referredDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3
	 * ReferredDocumentInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDocument
	 * Agreement.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2
	 * MandateInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information to identify the underlying documents associated with the mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateInformation2, Optional<ReferredDocumentInformation3>> mmReferredDocument = new MMMessageAssociationEnd<MandateInformation2, Optional<ReferredDocumentInformation3>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateInformation2.mmObject();
			isDerived = false;
			xmlTag = "RfrdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocument";
			definition = "Set of elements used to provide information to identify the underlying documents associated with the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReferredDocumentInformation3.mmObject();
		}

		@Override
		public Optional<ReferredDocumentInformation3> getValue(MandateInformation2 obj) {
			return obj.getReferredDocument();
		}

		@Override
		public void setValue(MandateInformation2 obj, Optional<ReferredDocumentInformation3> value) {
			obj.setReferredDocument(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateInformation2.mmMandateIdentification, com.tools20022.repository.msg.MandateInformation2.mmMandateRequestIdentification,
						com.tools20022.repository.msg.MandateInformation2.mmType, com.tools20022.repository.msg.MandateInformation2.mmOccurrences, com.tools20022.repository.msg.MandateInformation2.mmCollectionAmount,
						com.tools20022.repository.msg.MandateInformation2.mmMaximumAmount, com.tools20022.repository.msg.MandateInformation2.mmCreditorSchemeIdentification, com.tools20022.repository.msg.MandateInformation2.mmCreditor,
						com.tools20022.repository.msg.MandateInformation2.mmCreditorAccount, com.tools20022.repository.msg.MandateInformation2.mmCreditorAgent, com.tools20022.repository.msg.MandateInformation2.mmUltimateCreditor,
						com.tools20022.repository.msg.MandateInformation2.mmDebtor, com.tools20022.repository.msg.MandateInformation2.mmDebtorAccount, com.tools20022.repository.msg.MandateInformation2.mmDebtorAgent,
						com.tools20022.repository.msg.MandateInformation2.mmUltimateDebtor, com.tools20022.repository.msg.MandateInformation2.mmReferredDocument);
				messageBuildingBlock_lazy = () -> Arrays.asList(MandateInitiationRequestV01.mmMandate);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forMandateInformation2,
						com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandateInformation2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateInformation2";
				definition = "Information that serves as a basis to debit an account.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMandateIdentification() {
		return mandateIdentification == null ? Optional.empty() : Optional.of(mandateIdentification);
	}

	public MandateInformation2 setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = mandateIdentification;
		return this;
	}

	public Max35Text getMandateRequestIdentification() {
		return mandateRequestIdentification;
	}

	public MandateInformation2 setMandateRequestIdentification(Max35Text mandateRequestIdentification) {
		this.mandateRequestIdentification = Objects.requireNonNull(mandateRequestIdentification);
		return this;
	}

	public Optional<MandateTypeInformation1> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public MandateInformation2 setType(MandateTypeInformation1 type) {
		this.type = type;
		return this;
	}

	public Optional<MandateOccurrences1> getOccurrences() {
		return occurrences == null ? Optional.empty() : Optional.of(occurrences);
	}

	public MandateInformation2 setOccurrences(MandateOccurrences1 occurrences) {
		this.occurrences = occurrences;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCollectionAmount() {
		return collectionAmount == null ? Optional.empty() : Optional.of(collectionAmount);
	}

	public MandateInformation2 setCollectionAmount(ActiveCurrencyAndAmount collectionAmount) {
		this.collectionAmount = collectionAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMaximumAmount() {
		return maximumAmount == null ? Optional.empty() : Optional.of(maximumAmount);
	}

	public MandateInformation2 setMaximumAmount(ActiveCurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
		return this;
	}

	public Optional<PartyIdentification32> getCreditorSchemeIdentification() {
		return creditorSchemeIdentification == null ? Optional.empty() : Optional.of(creditorSchemeIdentification);
	}

	public MandateInformation2 setCreditorSchemeIdentification(PartyIdentification32 creditorSchemeIdentification) {
		this.creditorSchemeIdentification = creditorSchemeIdentification;
		return this;
	}

	public PartyIdentification32 getCreditor() {
		return creditor;
	}

	public MandateInformation2 setCreditor(PartyIdentification32 creditor) {
		this.creditor = Objects.requireNonNull(creditor);
		return this;
	}

	public Optional<CashAccount16> getCreditorAccount() {
		return creditorAccount == null ? Optional.empty() : Optional.of(creditorAccount);
	}

	public MandateInformation2 setCreditorAccount(CashAccount16 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getCreditorAgent() {
		return creditorAgent == null ? Optional.empty() : Optional.of(creditorAgent);
	}

	public MandateInformation2 setCreditorAgent(BranchAndFinancialInstitutionIdentification4 creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	public Optional<PartyIdentification32> getUltimateCreditor() {
		return ultimateCreditor == null ? Optional.empty() : Optional.of(ultimateCreditor);
	}

	public MandateInformation2 setUltimateCreditor(PartyIdentification32 ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
		return this;
	}

	public PartyIdentification32 getDebtor() {
		return debtor;
	}

	public MandateInformation2 setDebtor(PartyIdentification32 debtor) {
		this.debtor = Objects.requireNonNull(debtor);
		return this;
	}

	public Optional<CashAccount16> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public MandateInformation2 setDebtorAccount(CashAccount16 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public BranchAndFinancialInstitutionIdentification4 getDebtorAgent() {
		return debtorAgent;
	}

	public MandateInformation2 setDebtorAgent(BranchAndFinancialInstitutionIdentification4 debtorAgent) {
		this.debtorAgent = Objects.requireNonNull(debtorAgent);
		return this;
	}

	public Optional<PartyIdentification32> getUltimateDebtor() {
		return ultimateDebtor == null ? Optional.empty() : Optional.of(ultimateDebtor);
	}

	public MandateInformation2 setUltimateDebtor(PartyIdentification32 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<ReferredDocumentInformation3> getReferredDocument() {
		return referredDocument == null ? Optional.empty() : Optional.of(referredDocument);
	}

	public MandateInformation2 setReferredDocument(ReferredDocumentInformation3 referredDocument) {
		this.referredDocument = referredDocument;
		return this;
	}
}
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
import com.tools20022.repository.area.tsrv.UndertakingDemandV01;
import com.tools20022.repository.codeset.DemandType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.Demand;
import com.tools20022.repository.entity.Expiry;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the demand.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Demand1#mmIdentification
 * Demand1.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Demand1#mmType Demand1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Demand1#mmUndertakingIdentification
 * Demand1.mmUndertakingIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Demand1#mmDemandAmount
 * Demand1.mmDemandAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Demand1#mmAdvisingPartyReferenceNumber
 * Demand1.mmAdvisingPartyReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Demand1#mmSecondAdvisingPartyReferenceNumber
 * Demand1.mmSecondAdvisingPartyReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Demand1#mmConfirmerReferenceNumber
 * Demand1.mmConfirmerReferenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Demand1#mmSettlementAccount
 * Demand1.mmSettlementAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Demand1#mmPresentationDetails
 * Demand1.mmPresentationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Demand1#mmRequestedExpiryDate
 * Demand1.mmRequestedExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Demand1#mmDemandDocumentation
 * Demand1.mmDemandDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Demand1#mmAdditionalInformation
 * Demand1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingDemandV01#mmUndertakingDemandDetails
 * UndertakingDemandV01.mmUndertakingDemandDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedExpiryDate1Rule#forDemand1
 * ConstraintRequestedExpiryDate1Rule.forDemand1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedExpiryDate2Rule#forDemand1
 * ConstraintRequestedExpiryDate2Rule.forDemand1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Demand1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the demand."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Demand1", propOrder = {"identification", "type", "undertakingIdentification", "demandAmount", "advisingPartyReferenceNumber", "secondAdvisingPartyReferenceNumber", "confirmerReferenceNumber", "settlementAccount",
		"presentationDetails", "requestedExpiryDate", "demandDocumentation", "additionalInformation"})
public class Demand1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the presenting party to the demand."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Demand1, Max35Text> mmIdentification = new MMMessageAttribute<Demand1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier assigned by the presenting party to the demand.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Demand1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Demand1 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected DemandType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DemandType1Code
	 * DemandType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Demand#mmType Demand.mmType}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
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
	 * definition} = "Type of demand."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Demand1, DemandType1Code> mmType = new MMMessageAttribute<Demand1, DemandType1Code>() {
		{
			businessElementTrace_lazy = () -> Demand.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of demand.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandType1Code.mmObject();
		}

		@Override
		public DemandType1Code getValue(Demand1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Demand1 obj, DemandType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "UdrtkgId", required = true)
	protected Undertaking6 undertakingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking6
	 * Undertaking6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Demand1, Undertaking6> mmUndertakingIdentification = new MMMessageAssociationEnd<Demand1, Undertaking6>() {
		{
			businessComponentTrace_lazy = () -> Undertaking.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Undertaking6.mmObject();
		}

		@Override
		public Undertaking6 getValue(Demand1 obj) {
			return obj.getUndertakingIdentification();
		}

		@Override
		public void setValue(Demand1 obj, Undertaking6 value) {
			obj.setUndertakingIdentification(value);
		}
	};
	@XmlElement(name = "DmndAmt", required = true)
	protected UndertakingAmount3 demandAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UndertakingAmount3
	 * UndertakingAmount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Demand#mmDemandAmount
	 * Demand.mmDemandAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmndAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the demand amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Demand1, UndertakingAmount3> mmDemandAmount = new MMMessageAssociationEnd<Demand1, UndertakingAmount3>() {
		{
			businessElementTrace_lazy = () -> Demand.mmDemandAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "DmndAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandAmount";
			definition = "Details related to the demand amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingAmount3.mmObject();
		}

		@Override
		public UndertakingAmount3 getValue(Demand1 obj) {
			return obj.getDemandAmount();
		}

		@Override
		public void setValue(Demand1 obj, UndertakingAmount3 value) {
			obj.setDemandAmount(value);
		}
	};
	@XmlElement(name = "AdvsgPtyRefNb")
	protected Max35Text advisingPartyReferenceNumber;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdvsgPtyRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisingPartyReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the advising party to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Demand1, Optional<Max35Text>> mmAdvisingPartyReferenceNumber = new MMMessageAttribute<Demand1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPtyRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingPartyReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the advising party to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Demand1 obj) {
			return obj.getAdvisingPartyReferenceNumber();
		}

		@Override
		public void setValue(Demand1 obj, Optional<Max35Text> value) {
			obj.setAdvisingPartyReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndAdvsgPtyRefNb")
	protected Max35Text secondAdvisingPartyReferenceNumber;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndAdvsgPtyRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondAdvisingPartyReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the second advising party to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Demand1, Optional<Max35Text>> mmSecondAdvisingPartyReferenceNumber = new MMMessageAttribute<Demand1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPtyRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingPartyReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the second advising party to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Demand1 obj) {
			return obj.getSecondAdvisingPartyReferenceNumber();
		}

		@Override
		public void setValue(Demand1 obj, Optional<Max35Text> value) {
			obj.setSecondAdvisingPartyReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CnfrmrRefNb")
	protected Max35Text confirmerReferenceNumber;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnfrmrRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmerReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the confirmer to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Demand1, Optional<Max35Text>> mmConfirmerReferenceNumber = new MMMessageAttribute<Demand1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "CnfrmrRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmerReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the confirmer to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Demand1 obj) {
			return obj.getConfirmerReferenceNumber();
		}

		@Override
		public void setValue(Demand1 obj, Optional<Max35Text> value) {
			obj.setConfirmerReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAcct")
	protected List<CashAccount27> settlementAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount27
	 * CashAccount27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
	 * CashSettlement.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the settlement account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Demand1, List<CashAccount27>> mmSettlementAccount = new MMMessageAssociationEnd<Demand1, List<CashAccount27>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "SttlmAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAccount";
			definition = "Details related to the settlement account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount27.mmObject();
		}

		@Override
		public List<CashAccount27> getValue(Demand1 obj) {
			return obj.getSettlementAccount();
		}

		@Override
		public void setValue(Demand1 obj, List<CashAccount27> value) {
			obj.setSettlementAccount(value);
		}
	};
	@XmlElement(name = "PresntnDtls")
	protected Presentation2 presentationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Presentation2
	 * Presentation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPresentation
	 * Undertaking.mmPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PresntnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the beneficiary's presentation of documents."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Demand1, Optional<Presentation2>> mmPresentationDetails = new MMMessageAssociationEnd<Demand1, Optional<Presentation2>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPresentation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "PresntnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationDetails";
			definition = "Details of the beneficiary's presentation of documents.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Presentation2.mmObject();
		}

		@Override
		public Optional<Presentation2> getValue(Demand1 obj) {
			return obj.getPresentationDetails();
		}

		@Override
		public void setValue(Demand1 obj, Optional<Presentation2> value) {
			obj.setPresentationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdXpryDt")
	protected ISODate requestedExpiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#mmExpiryDateTime
	 * Expiry.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdXpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested new expiry date as an alternative to payment of the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Demand1, Optional<ISODate>> mmRequestedExpiryDate = new MMMessageAttribute<Demand1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Expiry.mmExpiryDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "ReqdXpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExpiryDate";
			definition = "Requested new expiry date as an alternative to payment of the demand.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Demand1 obj) {
			return obj.getRequestedExpiryDate();
		}

		@Override
		public void setValue(Demand1 obj, Optional<ISODate> value) {
			obj.setRequestedExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DmndDcmnttn")
	protected DemandDocumentation1 demandDocumentation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DemandDocumentation1
	 * DemandDocumentation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmndDcmnttn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandDocumentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document(s) presented for examination."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Demand1, Optional<DemandDocumentation1>> mmDemandDocumentation = new MMMessageAssociationEnd<Demand1, Optional<DemandDocumentation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "DmndDcmnttn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandDocumentation";
			definition = "Document(s) presented for examination.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DemandDocumentation1.mmObject();
		}

		@Override
		public Optional<DemandDocumentation1> getValue(Demand1 obj) {
			return obj.getDemandDocumentation();
		}

		@Override
		public void setValue(Demand1 obj, Optional<DemandDocumentation1> value) {
			obj.setDemandDocumentation(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Demand1
	 * Demand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Demand1, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<Demand1, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Demand1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the demand.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(Demand1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(Demand1 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Demand1.mmIdentification, com.tools20022.repository.msg.Demand1.mmType, com.tools20022.repository.msg.Demand1.mmUndertakingIdentification,
						com.tools20022.repository.msg.Demand1.mmDemandAmount, com.tools20022.repository.msg.Demand1.mmAdvisingPartyReferenceNumber, com.tools20022.repository.msg.Demand1.mmSecondAdvisingPartyReferenceNumber,
						com.tools20022.repository.msg.Demand1.mmConfirmerReferenceNumber, com.tools20022.repository.msg.Demand1.mmSettlementAccount, com.tools20022.repository.msg.Demand1.mmPresentationDetails,
						com.tools20022.repository.msg.Demand1.mmRequestedExpiryDate, com.tools20022.repository.msg.Demand1.mmDemandDocumentation, com.tools20022.repository.msg.Demand1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingDemandV01.mmUndertakingDemandDetails);
				trace_lazy = () -> Demand.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedExpiryDate1Rule.forDemand1, com.tools20022.repository.constraints.ConstraintRequestedExpiryDate2Rule.forDemand1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Demand1";
				definition = "Details of the demand.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Demand1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DemandType1Code getType() {
		return type;
	}

	public Demand1 setType(DemandType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Undertaking6 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public Demand1 setUndertakingIdentification(Undertaking6 undertakingIdentification) {
		this.undertakingIdentification = Objects.requireNonNull(undertakingIdentification);
		return this;
	}

	public UndertakingAmount3 getDemandAmount() {
		return demandAmount;
	}

	public Demand1 setDemandAmount(UndertakingAmount3 demandAmount) {
		this.demandAmount = Objects.requireNonNull(demandAmount);
		return this;
	}

	public Optional<Max35Text> getAdvisingPartyReferenceNumber() {
		return advisingPartyReferenceNumber == null ? Optional.empty() : Optional.of(advisingPartyReferenceNumber);
	}

	public Demand1 setAdvisingPartyReferenceNumber(Max35Text advisingPartyReferenceNumber) {
		this.advisingPartyReferenceNumber = advisingPartyReferenceNumber;
		return this;
	}

	public Optional<Max35Text> getSecondAdvisingPartyReferenceNumber() {
		return secondAdvisingPartyReferenceNumber == null ? Optional.empty() : Optional.of(secondAdvisingPartyReferenceNumber);
	}

	public Demand1 setSecondAdvisingPartyReferenceNumber(Max35Text secondAdvisingPartyReferenceNumber) {
		this.secondAdvisingPartyReferenceNumber = secondAdvisingPartyReferenceNumber;
		return this;
	}

	public Optional<Max35Text> getConfirmerReferenceNumber() {
		return confirmerReferenceNumber == null ? Optional.empty() : Optional.of(confirmerReferenceNumber);
	}

	public Demand1 setConfirmerReferenceNumber(Max35Text confirmerReferenceNumber) {
		this.confirmerReferenceNumber = confirmerReferenceNumber;
		return this;
	}

	public List<CashAccount27> getSettlementAccount() {
		return settlementAccount == null ? settlementAccount = new ArrayList<>() : settlementAccount;
	}

	public Demand1 setSettlementAccount(List<CashAccount27> settlementAccount) {
		this.settlementAccount = Objects.requireNonNull(settlementAccount);
		return this;
	}

	public Optional<Presentation2> getPresentationDetails() {
		return presentationDetails == null ? Optional.empty() : Optional.of(presentationDetails);
	}

	public Demand1 setPresentationDetails(Presentation2 presentationDetails) {
		this.presentationDetails = presentationDetails;
		return this;
	}

	public Optional<ISODate> getRequestedExpiryDate() {
		return requestedExpiryDate == null ? Optional.empty() : Optional.of(requestedExpiryDate);
	}

	public Demand1 setRequestedExpiryDate(ISODate requestedExpiryDate) {
		this.requestedExpiryDate = requestedExpiryDate;
		return this;
	}

	public Optional<DemandDocumentation1> getDemandDocumentation() {
		return demandDocumentation == null ? Optional.empty() : Optional.of(demandDocumentation);
	}

	public Demand1 setDemandDocumentation(DemandDocumentation1 demandDocumentation) {
		this.demandDocumentation = demandDocumentation;
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public Demand1 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}
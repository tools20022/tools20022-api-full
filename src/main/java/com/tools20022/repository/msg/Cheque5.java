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
import com.tools20022.repository.choice.ChequeDeliveryMethod1Choice;
import com.tools20022.repository.codeset.ChequeType2Code;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NameAndAddress3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics related to a cheque instruction, such as cheque type
 * or cheque number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmChequeType
 * Cheque5.mmChequeType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmChequeNumber
 * Cheque5.mmChequeNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmChequeFrom
 * Cheque5.mmChequeFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmDeliveryMethod
 * Cheque5.mmDeliveryMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmDeliverTo
 * Cheque5.mmDeliverTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmInstructionPriority
 * Cheque5.mmInstructionPriority}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmChequeMaturityDate
 * Cheque5.mmChequeMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmFormsCode
 * Cheque5.mmFormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmMemoField
 * Cheque5.mmMemoField}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmRegionalClearingZone
 * Cheque5.mmRegionalClearingZone}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmPrintLocation
 * Cheque5.mmPrintLocation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ChequeIssue
 * ChequeIssue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cheque5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics related to a cheque instruction, such as cheque type or cheque number."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeMaturityDateRule#forCheque5
 * ConstraintChequeMaturityDateRule.forCheque5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Cheque5", propOrder = {"chequeType", "chequeNumber", "chequeFrom", "deliveryMethod", "deliverTo", "instructionPriority", "chequeMaturityDate", "formsCode", "memoField", "regionalClearingZone", "printLocation"})
public class Cheque5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ChqTp")
	protected ChequeType2Code chequeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code
	 * ChequeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmChequeType
	 * Cheque.mmChequeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of cheque to be issued by the first agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<ChequeType2Code>> mmChequeType = new MMMessageAttribute<Cheque5, Optional<ChequeType2Code>>() {
		{
			businessElementTrace_lazy = () -> Cheque.mmChequeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "ChqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeType";
			definition = "Specifies the type of cheque to be issued by the first agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChequeType2Code.mmObject();
		}

		@Override
		public Optional<ChequeType2Code> getValue(Cheque5 obj) {
			return obj.getChequeType();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<ChequeType2Code> value) {
			obj.setChequeType(value.orElse(null));
		}
	};
	@XmlElement(name = "ChqNb")
	protected Max35Text chequeNumber;
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
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmCreditInstrumentIdentification
	 * CreditInstrument.mmCreditInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the cheque number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<Max35Text>> mmChequeNumber = new MMMessageAttribute<Cheque5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmCreditInstrumentIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "ChqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeNumber";
			definition = "Identifies the cheque number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Cheque5 obj) {
			return obj.getChequeNumber();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<Max35Text> value) {
			obj.setChequeNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "ChqFr")
	protected NameAndAddress3 chequeFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NameAndAddress3
	 * NameAndAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that ordered the issuance of the cheque."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<NameAndAddress3>> mmChequeFrom = new MMMessageAttribute<Cheque5, Optional<NameAndAddress3>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "ChqFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeFrom";
			definition = "Identifies the party that ordered the issuance of the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NameAndAddress3.mmObject();
		}

		@Override
		public Optional<NameAndAddress3> getValue(Cheque5 obj) {
			return obj.getChequeFrom();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<NameAndAddress3> value) {
			obj.setChequeFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryMtd")
	protected ChequeDeliveryMethod1Choice deliveryMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ChequeDeliveryMethod1Choice
	 * ChequeDeliveryMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliveryMethod
	 * ChequeIssue.mmDeliveryMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the delivery method of the cheque by the debtor's agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cheque5, Optional<ChequeDeliveryMethod1Choice>> mmDeliveryMethod = new MMMessageAssociationEnd<Cheque5, Optional<ChequeDeliveryMethod1Choice>>() {
		{
			businessElementTrace_lazy = () -> ChequeIssue.mmDeliveryMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "DlvryMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies the delivery method of the cheque by the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChequeDeliveryMethod1Choice.mmObject();
		}

		@Override
		public Optional<ChequeDeliveryMethod1Choice> getValue(Cheque5 obj) {
			return obj.getDeliveryMethod();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<ChequeDeliveryMethod1Choice> value) {
			obj.setDeliveryMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrTo")
	protected NameAndAddress3 deliverTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NameAndAddress3
	 * NameAndAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliverTo
	 * ChequeIssue.mmDeliverTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party to whom the debtor's agent should send the cheque."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<NameAndAddress3>> mmDeliverTo = new MMMessageAttribute<Cheque5, Optional<NameAndAddress3>>() {
		{
			businessElementTrace_lazy = () -> ChequeIssue.mmDeliverTo;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "DlvrTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverTo";
			definition = "Identifies the party to whom the debtor's agent should send the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NameAndAddress3.mmObject();
		}

		@Override
		public Optional<NameAndAddress3> getValue(Cheque5 obj) {
			return obj.getDeliverTo();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<NameAndAddress3> value) {
			obj.setDeliverTo(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrPrty")
	protected Priority2Code instructionPriority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority2Code
	 * Priority2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPriority
	 * Payment.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionPriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<Priority2Code>> mmInstructionPriority = new MMMessageAttribute<Cheque5, Optional<Priority2Code>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}

		@Override
		public Optional<Priority2Code> getValue(Cheque5 obj) {
			return obj.getInstructionPriority();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<Priority2Code> value) {
			obj.setInstructionPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "ChqMtrtyDt")
	protected ISODate chequeMaturityDate;
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmMaturityDate
	 * Cheque.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqMtrtyDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeMaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the draft becomes payable and the debtor's account is debited."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<ISODate>> mmChequeMaturityDate = new MMMessageAttribute<Cheque5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Cheque.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "ChqMtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeMaturityDate";
			definition = "Date when the draft becomes payable and the debtor's account is debited.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Cheque5 obj) {
			return obj.getChequeMaturityDate();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<ISODate> value) {
			obj.setChequeMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FrmsCd")
	protected Max35Text formsCode;
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmFormsCode
	 * Cheque.mmFormsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmsCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code agreed between the initiating party and the debtor's agent, that specifies the cheque layout, company logo and digitised signature to be used to print the cheque."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<Max35Text>> mmFormsCode = new MMMessageAttribute<Cheque5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Cheque.mmFormsCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "FrmsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormsCode";
			definition = "Code agreed between the initiating party and the debtor's agent, that specifies the cheque layout, company logo and digitised signature to be used to print the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Cheque5 obj) {
			return obj.getFormsCode();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<Max35Text> value) {
			obj.setFormsCode(value.orElse(null));
		}
	};
	@XmlElement(name = "MemoFld")
	protected Max35Text memoField;
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmMemoField
	 * Cheque.mmMemoField}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MemoFld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoField"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<Max35Text>> mmMemoField = new MMMessageAttribute<Cheque5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Cheque.mmMemoField;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "MemoFld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoField";
			definition = "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Cheque5 obj) {
			return obj.getMemoField();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<Max35Text> value) {
			obj.setMemoField(value.orElse(null));
		}
	};
	@XmlElement(name = "RgnlClrZone")
	protected Max35Text regionalClearingZone;
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmRegionalClearingZone
	 * Cheque.mmRegionalClearingZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgnlClrZone"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionalClearingZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<Max35Text>> mmRegionalClearingZone = new MMMessageAttribute<Cheque5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Cheque.mmRegionalClearingZone;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "RgnlClrZone";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegionalClearingZone";
			definition = "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Cheque5 obj) {
			return obj.getRegionalClearingZone();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<Max35Text> value) {
			obj.setRegionalClearingZone(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtLctn")
	protected Max35Text printLocation;
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
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmPrintLocation
	 * ChequeIssue.mmPrintLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque5
	 * Cheque5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtLctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the print location of the cheque."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cheque5, Optional<Max35Text>> mmPrintLocation = new MMMessageAttribute<Cheque5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ChequeIssue.mmPrintLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
			isDerived = false;
			xmlTag = "PrtLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintLocation";
			definition = "Specifies the print location of the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Cheque5 obj) {
			return obj.getPrintLocation();
		}

		@Override
		public void setValue(Cheque5 obj, Optional<Max35Text> value) {
			obj.setPrintLocation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque5.mmChequeType, com.tools20022.repository.msg.Cheque5.mmChequeNumber, com.tools20022.repository.msg.Cheque5.mmChequeFrom,
						com.tools20022.repository.msg.Cheque5.mmDeliveryMethod, com.tools20022.repository.msg.Cheque5.mmDeliverTo, com.tools20022.repository.msg.Cheque5.mmInstructionPriority,
						com.tools20022.repository.msg.Cheque5.mmChequeMaturityDate, com.tools20022.repository.msg.Cheque5.mmFormsCode, com.tools20022.repository.msg.Cheque5.mmMemoField,
						com.tools20022.repository.msg.Cheque5.mmRegionalClearingZone, com.tools20022.repository.msg.Cheque5.mmPrintLocation);
				trace_lazy = () -> ChequeIssue.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChequeMaturityDateRule.forCheque5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cheque5";
				definition = "Set of characteristics related to a cheque instruction, such as cheque type or cheque number.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ChequeType2Code> getChequeType() {
		return chequeType == null ? Optional.empty() : Optional.of(chequeType);
	}

	public Cheque5 setChequeType(ChequeType2Code chequeType) {
		this.chequeType = chequeType;
		return this;
	}

	public Optional<Max35Text> getChequeNumber() {
		return chequeNumber == null ? Optional.empty() : Optional.of(chequeNumber);
	}

	public Cheque5 setChequeNumber(Max35Text chequeNumber) {
		this.chequeNumber = chequeNumber;
		return this;
	}

	public Optional<NameAndAddress3> getChequeFrom() {
		return chequeFrom == null ? Optional.empty() : Optional.of(chequeFrom);
	}

	public Cheque5 setChequeFrom(NameAndAddress3 chequeFrom) {
		this.chequeFrom = chequeFrom;
		return this;
	}

	public Optional<ChequeDeliveryMethod1Choice> getDeliveryMethod() {
		return deliveryMethod == null ? Optional.empty() : Optional.of(deliveryMethod);
	}

	public Cheque5 setDeliveryMethod(ChequeDeliveryMethod1Choice deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
		return this;
	}

	public Optional<NameAndAddress3> getDeliverTo() {
		return deliverTo == null ? Optional.empty() : Optional.of(deliverTo);
	}

	public Cheque5 setDeliverTo(NameAndAddress3 deliverTo) {
		this.deliverTo = deliverTo;
		return this;
	}

	public Optional<Priority2Code> getInstructionPriority() {
		return instructionPriority == null ? Optional.empty() : Optional.of(instructionPriority);
	}

	public Cheque5 setInstructionPriority(Priority2Code instructionPriority) {
		this.instructionPriority = instructionPriority;
		return this;
	}

	public Optional<ISODate> getChequeMaturityDate() {
		return chequeMaturityDate == null ? Optional.empty() : Optional.of(chequeMaturityDate);
	}

	public Cheque5 setChequeMaturityDate(ISODate chequeMaturityDate) {
		this.chequeMaturityDate = chequeMaturityDate;
		return this;
	}

	public Optional<Max35Text> getFormsCode() {
		return formsCode == null ? Optional.empty() : Optional.of(formsCode);
	}

	public Cheque5 setFormsCode(Max35Text formsCode) {
		this.formsCode = formsCode;
		return this;
	}

	public Optional<Max35Text> getMemoField() {
		return memoField == null ? Optional.empty() : Optional.of(memoField);
	}

	public Cheque5 setMemoField(Max35Text memoField) {
		this.memoField = memoField;
		return this;
	}

	public Optional<Max35Text> getRegionalClearingZone() {
		return regionalClearingZone == null ? Optional.empty() : Optional.of(regionalClearingZone);
	}

	public Cheque5 setRegionalClearingZone(Max35Text regionalClearingZone) {
		this.regionalClearingZone = regionalClearingZone;
		return this;
	}

	public Optional<Max35Text> getPrintLocation() {
		return printLocation == null ? Optional.empty() : Optional.of(printLocation);
	}

	public Cheque5 setPrintLocation(Max35Text printLocation) {
		this.printLocation = printLocation;
		return this;
	}
}
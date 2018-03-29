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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.RestrictedFINXMax35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding account balance. Contains
 * transaction details of the stock loans, repurchase agreements (REPOs) and
 * undelivered trades (FAILs).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1#mmPlaceAndName
 * AccountBalanceExtensionSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1#mmTransactionPosition
 * AccountBalanceExtensionSD1.mmTransactionPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1#mmAsOfDate
 * AccountBalanceExtensionSD1.mmAsOfDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1#mmDeliveryDate
 * AccountBalanceExtensionSD1.mmDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1#mmContraParticipantNumber
 * AccountBalanceExtensionSD1.mmContraParticipantNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1#mmReceiverAccountNumber
 * AccountBalanceExtensionSD1.mmReceiverAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1#mmDelivererAccountNumber
 * AccountBalanceExtensionSD1.mmDelivererAccountNumber}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountBalanceExtensionSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD2
 * AccountBalanceExtensionSD2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountBalanceExtensionSD1", propOrder = {"placeAndName", "transactionPosition", "asOfDate", "deliveryDate", "contraParticipantNumber", "receiverAccountNumber", "delivererAccountNumber"})
public class AccountBalanceExtensionSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1
	 * AccountBalanceExtensionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceExtensionSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<AccountBalanceExtensionSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(AccountBalanceExtensionSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "TxPos")
	protected AdjustedBalanceTypeSD1Choice transactionPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice
	 * AdjustedBalanceTypeSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1
	 * AccountBalanceExtensionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Transaction Position</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position that is concerned in transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceExtensionSD1, Optional<AdjustedBalanceTypeSD1Choice>> mmTransactionPosition = new MMMessageAttribute<AccountBalanceExtensionSD1, Optional<AdjustedBalanceTypeSD1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "TxPos";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Position"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionPosition";
			definition = "Position that is concerned in transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdjustedBalanceTypeSD1Choice.mmObject();
		}

		@Override
		public Optional<AdjustedBalanceTypeSD1Choice> getValue(AccountBalanceExtensionSD1 obj) {
			return obj.getTransactionPosition();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD1 obj, Optional<AdjustedBalanceTypeSD1Choice> value) {
			obj.setTransactionPosition(value.orElse(null));
		}
	};
	@XmlElement(name = "AsOfDt")
	protected ISODate asOfDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1
	 * AccountBalanceExtensionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsOfDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: As Of Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsOfDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date of the transaction. Applicable to Fail transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceExtensionSD1, Optional<ISODate>> mmAsOfDate = new MMMessageAttribute<AccountBalanceExtensionSD1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "AsOfDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "As Of Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsOfDate";
			definition = "Effective date of the transaction. Applicable to Fail transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AccountBalanceExtensionSD1 obj) {
			return obj.getAsOfDate();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD1 obj, Optional<ISODate> value) {
			obj.setAsOfDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryDt")
	protected ISODate deliveryDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1
	 * AccountBalanceExtensionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Delivery Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the delivery. Applicable to Fail transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceExtensionSD1, Optional<ISODate>> mmDeliveryDate = new MMMessageAttribute<AccountBalanceExtensionSD1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "DlvryDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Delivery Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDate";
			definition = "Date of the delivery. Applicable to Fail transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AccountBalanceExtensionSD1 obj) {
			return obj.getDeliveryDate();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD1 obj, Optional<ISODate> value) {
			obj.setDeliveryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ContraPtcptNb")
	protected Max8Text contraParticipantNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1
	 * AccountBalanceExtensionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ContraPtcptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Contra Participant Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraParticipantNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction contra participant identification for stock loans, repurchase agreements (REPOs), securities undelivered (FAILs)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceExtensionSD1, Optional<Max8Text>> mmContraParticipantNumber = new MMMessageAttribute<AccountBalanceExtensionSD1, Optional<Max8Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contra Participant Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification for stock loans, repurchase agreements (REPOs), securities undelivered (FAILs).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}

		@Override
		public Optional<Max8Text> getValue(AccountBalanceExtensionSD1 obj) {
			return obj.getContraParticipantNumber();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD1 obj, Optional<Max8Text> value) {
			obj.setContraParticipantNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvrAcctNb")
	protected RestrictedFINXMax35Text receiverAccountNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax35Text
	 * RestrictedFINXMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1
	 * AccountBalanceExtensionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrAcctNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Receiver Account Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account number at receiver’s side. Applicable to Fail transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceExtensionSD1, Optional<RestrictedFINXMax35Text>> mmReceiverAccountNumber = new MMMessageAttribute<AccountBalanceExtensionSD1, Optional<RestrictedFINXMax35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvrAcctNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Receiver Account Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverAccountNumber";
			definition = "Account number at receiver’s side. Applicable to Fail transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax35Text> getValue(AccountBalanceExtensionSD1 obj) {
			return obj.getReceiverAccountNumber();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD1 obj, Optional<RestrictedFINXMax35Text> value) {
			obj.setReceiverAccountNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrrAcctNb")
	protected RestrictedFINXMax35Text delivererAccountNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax35Text
	 * RestrictedFINXMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1
	 * AccountBalanceExtensionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrAcctNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Deliverer Account Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelivererAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account number at deliverer’s side. Applicable to Fail transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceExtensionSD1, Optional<RestrictedFINXMax35Text>> mmDelivererAccountNumber = new MMMessageAttribute<AccountBalanceExtensionSD1, Optional<RestrictedFINXMax35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "DlvrrAcctNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Deliverer Account Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelivererAccountNumber";
			definition = "Account number at deliverer’s side. Applicable to Fail transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax35Text> getValue(AccountBalanceExtensionSD1 obj) {
			return obj.getDelivererAccountNumber();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD1 obj, Optional<RestrictedFINXMax35Text> value) {
			obj.setDelivererAccountNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmPlaceAndName, com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmTransactionPosition,
						com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmAsOfDate, com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmDeliveryDate,
						com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmContraParticipantNumber, com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmReceiverAccountNumber,
						com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmDelivererAccountNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountBalanceExtensionSD1";
				definition = "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).";
				nextVersions_lazy = () -> Arrays.asList(AccountBalanceExtensionSD2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public AccountBalanceExtensionSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<AdjustedBalanceTypeSD1Choice> getTransactionPosition() {
		return transactionPosition == null ? Optional.empty() : Optional.of(transactionPosition);
	}

	public AccountBalanceExtensionSD1 setTransactionPosition(AdjustedBalanceTypeSD1Choice transactionPosition) {
		this.transactionPosition = transactionPosition;
		return this;
	}

	public Optional<ISODate> getAsOfDate() {
		return asOfDate == null ? Optional.empty() : Optional.of(asOfDate);
	}

	public AccountBalanceExtensionSD1 setAsOfDate(ISODate asOfDate) {
		this.asOfDate = asOfDate;
		return this;
	}

	public Optional<ISODate> getDeliveryDate() {
		return deliveryDate == null ? Optional.empty() : Optional.of(deliveryDate);
	}

	public AccountBalanceExtensionSD1 setDeliveryDate(ISODate deliveryDate) {
		this.deliveryDate = deliveryDate;
		return this;
	}

	public Optional<Max8Text> getContraParticipantNumber() {
		return contraParticipantNumber == null ? Optional.empty() : Optional.of(contraParticipantNumber);
	}

	public AccountBalanceExtensionSD1 setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
		return this;
	}

	public Optional<RestrictedFINXMax35Text> getReceiverAccountNumber() {
		return receiverAccountNumber == null ? Optional.empty() : Optional.of(receiverAccountNumber);
	}

	public AccountBalanceExtensionSD1 setReceiverAccountNumber(RestrictedFINXMax35Text receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
		return this;
	}

	public Optional<RestrictedFINXMax35Text> getDelivererAccountNumber() {
		return delivererAccountNumber == null ? Optional.empty() : Optional.of(delivererAccountNumber);
	}

	public AccountBalanceExtensionSD1 setDelivererAccountNumber(RestrictedFINXMax35Text delivererAccountNumber) {
		this.delivererAccountNumber = delivererAccountNumber;
		return this;
	}
}
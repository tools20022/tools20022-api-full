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
import com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
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
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD2#mmPlaceAndName
 * AccountBalanceExtensionSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD2#mmTransactionPosition
 * AccountBalanceExtensionSD2.mmTransactionPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD2#mmAsOfDate
 * AccountBalanceExtensionSD2.mmAsOfDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD2#mmContraParticipantNumber
 * AccountBalanceExtensionSD2.mmContraParticipantNumber}</li>
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
 * "AccountBalanceExtensionSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD1
 * AccountBalanceExtensionSD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountBalanceExtensionSD2", propOrder = {"placeAndName", "transactionPosition", "asOfDate", "contraParticipantNumber"})
public class AccountBalanceExtensionSD2 {

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
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD2
	 * AccountBalanceExtensionSD2}</li>
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
	public static final MMMessageAttribute<AccountBalanceExtensionSD2, Max350Text> mmPlaceAndName = new MMMessageAttribute<AccountBalanceExtensionSD2, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD2.mmObject();
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
		public Max350Text getValue(AccountBalanceExtensionSD2 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD2 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "TxPos")
	protected AdjustedBalanceTypeSD2Choice transactionPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice
	 * AdjustedBalanceTypeSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD2
	 * AccountBalanceExtensionSD2}</li>
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
	public static final MMMessageAttribute<AccountBalanceExtensionSD2, Optional<AdjustedBalanceTypeSD2Choice>> mmTransactionPosition = new MMMessageAttribute<AccountBalanceExtensionSD2, Optional<AdjustedBalanceTypeSD2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD2.mmObject();
			isDerived = false;
			xmlTag = "TxPos";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Position"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionPosition";
			definition = "Position that is concerned in transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdjustedBalanceTypeSD2Choice.mmObject();
		}

		@Override
		public Optional<AdjustedBalanceTypeSD2Choice> getValue(AccountBalanceExtensionSD2 obj) {
			return obj.getTransactionPosition();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD2 obj, Optional<AdjustedBalanceTypeSD2Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD2
	 * AccountBalanceExtensionSD2}</li>
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
	 * definition} = "Effective date of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceExtensionSD2, Optional<ISODate>> mmAsOfDate = new MMMessageAttribute<AccountBalanceExtensionSD2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD2.mmObject();
			isDerived = false;
			xmlTag = "AsOfDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "As Of Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsOfDate";
			definition = "Effective date of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AccountBalanceExtensionSD2 obj) {
			return obj.getAsOfDate();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD2 obj, Optional<ISODate> value) {
			obj.setAsOfDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceExtensionSD2
	 * AccountBalanceExtensionSD2}</li>
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
	 * "Transaction contra participant identification for stock loans, repurchase agreements (REPOs)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountBalanceExtensionSD2, Optional<Max8Text>> mmContraParticipantNumber = new MMMessageAttribute<AccountBalanceExtensionSD2, Optional<Max8Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceExtensionSD2.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contra Participant Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification for stock loans, repurchase agreements (REPOs).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}

		@Override
		public Optional<Max8Text> getValue(AccountBalanceExtensionSD2 obj) {
			return obj.getContraParticipantNumber();
		}

		@Override
		public void setValue(AccountBalanceExtensionSD2 obj, Optional<Max8Text> value) {
			obj.setContraParticipantNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountBalanceExtensionSD2.mmPlaceAndName, com.tools20022.repository.msg.AccountBalanceExtensionSD2.mmTransactionPosition,
						com.tools20022.repository.msg.AccountBalanceExtensionSD2.mmAsOfDate, com.tools20022.repository.msg.AccountBalanceExtensionSD2.mmContraParticipantNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountBalanceExtensionSD2";
				definition = "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).";
				previousVersion_lazy = () -> AccountBalanceExtensionSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public AccountBalanceExtensionSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<AdjustedBalanceTypeSD2Choice> getTransactionPosition() {
		return transactionPosition == null ? Optional.empty() : Optional.of(transactionPosition);
	}

	public AccountBalanceExtensionSD2 setTransactionPosition(AdjustedBalanceTypeSD2Choice transactionPosition) {
		this.transactionPosition = transactionPosition;
		return this;
	}

	public Optional<ISODate> getAsOfDate() {
		return asOfDate == null ? Optional.empty() : Optional.of(asOfDate);
	}

	public AccountBalanceExtensionSD2 setAsOfDate(ISODate asOfDate) {
		this.asOfDate = asOfDate;
		return this;
	}

	public Optional<Max8Text> getContraParticipantNumber() {
		return contraParticipantNumber == null ? Optional.empty() : Optional.of(contraParticipantNumber);
	}

	public AccountBalanceExtensionSD2 setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
		return this;
	}
}
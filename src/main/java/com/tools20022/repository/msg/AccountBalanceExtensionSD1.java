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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.RestrictedFINXMax35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountBalanceExtensionSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).  "
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
public class AccountBalanceExtensionSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected AdjustedBalanceTypeSD1Choice transactionPosition;
	/**
	 * Position that is concerned in transaction.
	 * <p>
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
	public static final MMMessageAttribute mmTransactionPosition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "TxPos";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionPosition";
			definition = "Position that is concerned in transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdjustedBalanceTypeSD1Choice.mmObject();
		}
	};
	protected ISODate asOfDate;
	/**
	 * Effective date of the transaction. Applicable to Fail transactions.
	 * <p>
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
	public static final MMMessageAttribute mmAsOfDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "AsOfDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsOfDate";
			definition = "Effective date of the transaction. Applicable to Fail transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate deliveryDate;
	/**
	 * Date of the delivery. Applicable to Fail transactions.
	 * <p>
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
	public static final MMMessageAttribute mmDeliveryDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "DlvryDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDate";
			definition = "Date of the delivery. Applicable to Fail transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max8Text contraParticipantNumber;
	/**
	 * Transaction contra participant identification for stock loans, repurchase
	 * agreements (REPOs), securities undelivered (FAILs).
	 * <p>
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
	public static final MMMessageAttribute mmContraParticipantNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification for stock loans, repurchase agreements (REPOs), securities undelivered (FAILs).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	protected RestrictedFINXMax35Text receiverAccountNumber;
	/**
	 * Account number at receiver’s side. Applicable to Fail transactions.
	 * <p>
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
	public static final MMMessageAttribute mmReceiverAccountNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvrAcctNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverAccountNumber";
			definition = "Account number at receiver’s side. Applicable to Fail transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}
	};
	protected RestrictedFINXMax35Text delivererAccountNumber;
	/**
	 * Account number at deliverer’s side. Applicable to Fail transactions.
	 * <p>
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
	public static final MMMessageAttribute mmDelivererAccountNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountBalanceExtensionSD1.mmObject();
			isDerived = false;
			xmlTag = "DlvrrAcctNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelivererAccountNumber";
			definition = "Account number at deliverer’s side. Applicable to Fail transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmPlaceAndName, com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmTransactionPosition,
						com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmAsOfDate, com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmDeliveryDate,
						com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmContraParticipantNumber, com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmReceiverAccountNumber,
						com.tools20022.repository.msg.AccountBalanceExtensionSD1.mmDelivererAccountNumber);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountBalanceExtensionSD1";
				definition = "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).  ";
				nextVersions_lazy = () -> Arrays.asList(AccountBalanceExtensionSD2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public AdjustedBalanceTypeSD1Choice getTransactionPosition() {
		return transactionPosition;
	}

	public void setTransactionPosition(AdjustedBalanceTypeSD1Choice transactionPosition) {
		this.transactionPosition = transactionPosition;
	}

	public ISODate getAsOfDate() {
		return asOfDate;
	}

	public void setAsOfDate(ISODate asOfDate) {
		this.asOfDate = asOfDate;
	}

	public ISODate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(ISODate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Max8Text getContraParticipantNumber() {
		return contraParticipantNumber;
	}

	public void setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
	}

	public RestrictedFINXMax35Text getReceiverAccountNumber() {
		return receiverAccountNumber;
	}

	public void setReceiverAccountNumber(RestrictedFINXMax35Text receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
	}

	public RestrictedFINXMax35Text getDelivererAccountNumber() {
		return delivererAccountNumber;
	}

	public void setDelivererAccountNumber(RestrictedFINXMax35Text delivererAccountNumber) {
		this.delivererAccountNumber = delivererAccountNumber;
	}
}
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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parties used for acting parties that apply either to the whole message or to
 * individual sides.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3#mmAffirmingParty
 * ConfirmationParties3.mmAffirmingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties3#mmBuyer
 * ConfirmationParties3.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3#mmBorrower
 * ConfirmationParties3.mmBorrower}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties3#mmSeller
 * ConfirmationParties3.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties3#mmLender
 * ConfirmationParties3.mmLender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3#mmTradeBeneficiaryParty
 * ConfirmationParties3.mmTradeBeneficiaryParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01#mmConfirmationParties
 * SecuritiesTradeConfirmationResponseV01.mmConfirmationParties}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConfirmationParties3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parties used for acting parties that apply either to the whole message or to individual sides."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ConfirmationParties3", propOrder = {"affirmingParty", "buyer", "borrower", "seller", "lender", "tradeBeneficiaryParty"})
public class ConfirmationParties3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ConfirmationPartyDetails4 affirmingParty;
	/**
	 * Party (buyer or seller) that positively affirms the details of a
	 * previously agreed security trade confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4
	 * ConfirmationPartyDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AffirmingPartyRole
	 * AffirmingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3
	 * ConfirmationParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffrmgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAffirmingParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AffirmingPartyRole.mmObject();
			componentContext_lazy = () -> ConfirmationParties3.mmObject();
			isDerived = false;
			xmlTag = "AffrmgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails4.mmObject();
		}
	};
	protected ConfirmationPartyDetails2 buyer;
	/**
	 * Party that buys goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3
	 * ConfirmationParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuyer = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> ConfirmationParties3.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails2.mmObject();
		}
	};
	protected ConfirmationPartyDetails2 borrower;
	/**
	 * Party that has applied, met specific requirements, and received a
	 * monetary or securities loan from a lender. The party initiating the
	 * request signs a promissory note agreeing to pay the lien holder back
	 * during a specified timeframe for the entire loan amount plus any
	 * additional fees. The borrower is legally responsible for repayment of the
	 * loan and is subject to any penalties for not repaying the loan back based
	 * on the lending terms agreed upon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Borrower Borrower}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3
	 * ConfirmationParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brrwr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrower"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that has applied, met specific requirements, and received a monetary or securities loan from a lender. The party initiating the request signs a promissory note agreeing to pay the lien holder back during a specified timeframe for the entire loan amount plus any additional fees. The borrower is legally responsible for repayment of the loan and is subject to any penalties for not repaying the loan back based on the lending terms agreed upon."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBorrower = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Borrower.mmObject();
			componentContext_lazy = () -> ConfirmationParties3.mmObject();
			isDerived = false;
			xmlTag = "Brrwr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrower";
			definition = "Party that has applied, met specific requirements, and received a monetary or securities loan from a lender. The party initiating the request signs a promissory note agreeing to pay the lien holder back during a specified timeframe for the entire loan amount plus any additional fees. The borrower is legally responsible for repayment of the loan and is subject to any penalties for not repaying the loan back based on the lending terms agreed upon.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails2.mmObject();
		}
	};
	protected ConfirmationPartyDetails2 seller;
	/**
	 * Party that sells goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3
	 * ConfirmationParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSeller = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			componentContext_lazy = () -> ConfirmationParties3.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails2.mmObject();
		}
	};
	protected ConfirmationPartyDetails2 lender;
	/**
	 * A private, public or institutional entity which makes funds available to
	 * others to borrow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lender Lender}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3
	 * ConfirmationParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A private, public or institutional entity which makes funds available to others to borrow."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLender = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Lender.mmObject();
			componentContext_lazy = () -> ConfirmationParties3.mmObject();
			isDerived = false;
			xmlTag = "Lndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lender";
			definition = "A private, public or institutional entity which makes funds available to others to borrow.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails2.mmObject();
		}
	};
	protected ConfirmationPartyDetails3 tradeBeneficiaryParty;
	/**
	 * Party involved in a legal proceeding, agreement, or other transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3
	 * ConfirmationPartyDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3
	 * ConfirmationParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradBnfcryPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeBeneficiaryParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party involved  in a legal proceeding, agreement, or other transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeBeneficiaryParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> ConfirmationParties3.mmObject();
			isDerived = false;
			xmlTag = "TradBnfcryPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeBeneficiaryParty";
			definition = "Party involved  in a legal proceeding, agreement, or other transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ConfirmationParties3.mmAffirmingParty, ConfirmationParties3.mmBuyer, ConfirmationParties3.mmBorrower, ConfirmationParties3.mmSeller, ConfirmationParties3.mmLender,
						ConfirmationParties3.mmTradeBeneficiaryParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationResponseV01.mmConfirmationParties);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationParties3";
				definition = "Parties used for acting parties that apply either to the whole message or to individual sides.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AffrmgPty", required = true)
	public ConfirmationPartyDetails4 getAffirmingParty() {
		return affirmingParty;
	}

	public void setAffirmingParty(com.tools20022.repository.msg.ConfirmationPartyDetails4 affirmingParty) {
		this.affirmingParty = affirmingParty;
	}

	@XmlElement(name = "Buyr")
	public ConfirmationPartyDetails2 getBuyer() {
		return buyer;
	}

	public void setBuyer(com.tools20022.repository.msg.ConfirmationPartyDetails2 buyer) {
		this.buyer = buyer;
	}

	@XmlElement(name = "Brrwr")
	public ConfirmationPartyDetails2 getBorrower() {
		return borrower;
	}

	public void setBorrower(com.tools20022.repository.msg.ConfirmationPartyDetails2 borrower) {
		this.borrower = borrower;
	}

	@XmlElement(name = "Sellr")
	public ConfirmationPartyDetails2 getSeller() {
		return seller;
	}

	public void setSeller(com.tools20022.repository.msg.ConfirmationPartyDetails2 seller) {
		this.seller = seller;
	}

	@XmlElement(name = "Lndr")
	public ConfirmationPartyDetails2 getLender() {
		return lender;
	}

	public void setLender(com.tools20022.repository.msg.ConfirmationPartyDetails2 lender) {
		this.lender = lender;
	}

	@XmlElement(name = "TradBnfcryPty")
	public ConfirmationPartyDetails3 getTradeBeneficiaryParty() {
		return tradeBeneficiaryParty;
	}

	public void setTradeBeneficiaryParty(com.tools20022.repository.msg.ConfirmationPartyDetails3 tradeBeneficiaryParty) {
		this.tradeBeneficiaryParty = tradeBeneficiaryParty;
	}
}
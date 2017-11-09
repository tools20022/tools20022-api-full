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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9#mmPlaceAndName
 * AccountBalanceSD9.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9#mmOriginalBalance
 * AccountBalanceSD9.mmOriginalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9#mmUnpledgedBalance
 * AccountBalanceSD9.mmUnpledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9#mmInvestmentUnpledgedBalance
 * AccountBalanceSD9.mmInvestmentUnpledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9#mmInvestmentPledgedBalance
 * AccountBalanceSD9.mmInvestmentPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9#mmAcceptedBalance
 * AccountBalanceSD9.mmAcceptedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9#mmUnacceptedBalance
 * AccountBalanceSD9.mmUnacceptedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9#mmOversubscriptionBalance
 * AccountBalanceSD9.mmOversubscriptionBalance}</li>
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
 * "AccountBalanceSD9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).  "
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD4
 * AccountBalanceSD4}</li>
 * </ul>
 */
public class AccountBalanceSD9 {

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
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9
	 * AccountBalanceSD9}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD4#mmPlaceAndName
	 * AccountBalanceSD4.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> AccountBalanceSD4.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected SignedQuantityFormat9 originalBalance;
	/**
	 * Position held in a security as of the day prior to publication date. This
	 * position is subject to a redemption lottery call when this is the first
	 * lottery. This balance will not be adjusted for the supplemental or
	 * concurrent lotteries and will remain constant to report the original
	 * position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9
	 * AccountBalanceSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in a security as of the day prior to publication date. This position is subject to a redemption lottery call when this is the first lottery. This balance will not be adjusted for the supplemental or concurrent lotteries and will remain constant to report the original position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD4#mmOriginalBalance
	 * AccountBalanceSD4.mmOriginalBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "OrgnlBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBalance";
			definition = "Position held in a security as of the day prior to publication date. This position is subject to a redemption lottery call when this is the first lottery. This balance will not be adjusted for the supplemental or concurrent lotteries and will remain constant to report the original position.";
			previousVersion_lazy = () -> AccountBalanceSD4.mmOriginalBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 unpledgedBalance;
	/**
	 * Portion of the Original Balance position held in DTC General Free account
	 * as of day prior to Publication Date. Position held in this account is
	 * subject to redemption lottery call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9
	 * AccountBalanceSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnpledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC General Free account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD4#mmUnpledgedBalance
	 * AccountBalanceSD4.mmUnpledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnpledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "UpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnpledgedBalance";
			definition = "Portion of the Original Balance position held in DTC General Free account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call.";
			previousVersion_lazy = () -> AccountBalanceSD4.mmUnpledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 investmentUnpledgedBalance;
	/**
	 * Portion of the Original Balance position held in DTC Segregated account
	 * as of day prior to Publication Date. Position held in this account is
	 * subject to redemption lottery call and must be released to allow
	 * allocation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9
	 * AccountBalanceSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtUpldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentUnpledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC Segregated account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD4#mmInvestmentUnpledgedBalance
	 * AccountBalanceSD4.mmInvestmentUnpledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentUnpledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "InvstmtUpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentUnpledgedBalance";
			definition = "Portion of the Original Balance position held in DTC Segregated account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.";
			previousVersion_lazy = () -> AccountBalanceSD4.mmInvestmentUnpledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 investmentPledgedBalance;
	/**
	 * Portion of the Original Balance position held in DTC Investment account
	 * as of day prior to Publication Date. Position held in this account is
	 * subject to redemption lottery call and must be released to allow
	 * allocation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9
	 * AccountBalanceSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtPldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC Investment account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD4#mmInvestmentPledgedBalance
	 * AccountBalanceSD4.mmInvestmentPledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentPledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPledgedBalance";
			definition = "Portion of the Original Balance position held in DTC Investment account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.";
			previousVersion_lazy = () -> AccountBalanceSD4.mmInvestmentPledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 acceptedBalance;
	/**
	 * Balance that has been accepted by the issuer / agent for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9
	 * AccountBalanceSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has been accepted by the issuer / agent for payment. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcceptedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "AccptdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedBalance";
			definition = "Balance that has been accepted by the issuer / agent for payment. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 unacceptedBalance;
	/**
	 * Balance that has not been accepted by issuer / agent for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9
	 * AccountBalanceSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UaccptdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has not been accepted by issuer / agent for payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnacceptedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "UaccptdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedBalance";
			definition = "Balance that has not been accepted by issuer / agent for payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 oversubscriptionBalance;
	/**
	 * For Rights Subscription events, total number of oversubscribed units
	 * applicable to the payment or the subscription charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD9
	 * AccountBalanceSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For Rights Subscription events, total number of oversubscribed units applicable to the payment or the subscription charge. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOversubscriptionBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionBalance";
			definition = "For Rights Subscription events, total number of oversubscribed units applicable to the payment or the subscription charge. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountBalanceSD9.mmPlaceAndName, AccountBalanceSD9.mmOriginalBalance, AccountBalanceSD9.mmUnpledgedBalance, AccountBalanceSD9.mmInvestmentUnpledgedBalance,
						AccountBalanceSD9.mmInvestmentPledgedBalance, AccountBalanceSD9.mmAcceptedBalance, AccountBalanceSD9.mmUnacceptedBalance, AccountBalanceSD9.mmOversubscriptionBalance);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountBalanceSD9";
				definition = "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).  ";
				previousVersion_lazy = () -> AccountBalanceSD4.mmObject();
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

	public SignedQuantityFormat9 getOriginalBalance() {
		return originalBalance;
	}

	public void setOriginalBalance(com.tools20022.repository.msg.SignedQuantityFormat9 originalBalance) {
		this.originalBalance = originalBalance;
	}

	public SignedQuantityFormat9 getUnpledgedBalance() {
		return unpledgedBalance;
	}

	public void setUnpledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 unpledgedBalance) {
		this.unpledgedBalance = unpledgedBalance;
	}

	public SignedQuantityFormat9 getInvestmentUnpledgedBalance() {
		return investmentUnpledgedBalance;
	}

	public void setInvestmentUnpledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 investmentUnpledgedBalance) {
		this.investmentUnpledgedBalance = investmentUnpledgedBalance;
	}

	public SignedQuantityFormat9 getInvestmentPledgedBalance() {
		return investmentPledgedBalance;
	}

	public void setInvestmentPledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 investmentPledgedBalance) {
		this.investmentPledgedBalance = investmentPledgedBalance;
	}

	public SignedQuantityFormat9 getAcceptedBalance() {
		return acceptedBalance;
	}

	public void setAcceptedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 acceptedBalance) {
		this.acceptedBalance = acceptedBalance;
	}

	public SignedQuantityFormat9 getUnacceptedBalance() {
		return unacceptedBalance;
	}

	public void setUnacceptedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 unacceptedBalance) {
		this.unacceptedBalance = unacceptedBalance;
	}

	public SignedQuantityFormat9 getOversubscriptionBalance() {
		return oversubscriptionBalance;
	}

	public void setOversubscriptionBalance(com.tools20022.repository.msg.SignedQuantityFormat9 oversubscriptionBalance) {
		this.oversubscriptionBalance = oversubscriptionBalance;
	}
}
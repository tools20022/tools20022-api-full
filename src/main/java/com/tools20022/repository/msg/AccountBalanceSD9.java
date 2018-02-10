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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountBalanceSD9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountBalanceSD13
 * AccountBalanceSD13}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD4
 * AccountBalanceSD4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountBalanceSD9", propOrder = {"placeAndName", "originalBalance", "unpledgedBalance", "investmentUnpledgedBalance", "investmentPledgedBalance", "acceptedBalance", "unacceptedBalance", "oversubscriptionBalance"})
public class AccountBalanceSD9 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD13#mmPlaceAndName
	 * AccountBalanceSD13.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD4#mmPlaceAndName
	 * AccountBalanceSD4.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(AccountBalanceSD13.mmPlaceAndName);
			previousVersion_lazy = () -> AccountBalanceSD4.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlBal")
	protected SignedQuantityFormat9 originalBalance;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD13#mmOriginalBalance
	 * AccountBalanceSD13.mmOriginalBalance}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "OrgnlBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBalance";
			definition = "Position held in a security as of the day prior to publication date. This position is subject to a redemption lottery call when this is the first lottery. This balance will not be adjusted for the supplemental or concurrent lotteries and will remain constant to report the original position.";
			nextVersions_lazy = () -> Arrays.asList(AccountBalanceSD13.mmOriginalBalance);
			previousVersion_lazy = () -> AccountBalanceSD4.mmOriginalBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	@XmlElement(name = "UpldgdBal")
	protected SignedQuantityFormat9 unpledgedBalance;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD13#mmUnpledgedBalance
	 * AccountBalanceSD13.mmUnpledgedBalance}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "UpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnpledgedBalance";
			definition = "Portion of the Original Balance position held in DTC General Free account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call.";
			nextVersions_lazy = () -> Arrays.asList(AccountBalanceSD13.mmUnpledgedBalance);
			previousVersion_lazy = () -> AccountBalanceSD4.mmUnpledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	@XmlElement(name = "InvstmtUpldgdBal")
	protected SignedQuantityFormat9 investmentUnpledgedBalance;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD13#mmInvestmentUnpledgedBalance
	 * AccountBalanceSD13.mmInvestmentUnpledgedBalance}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "InvstmtUpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentUnpledgedBalance";
			definition = "Portion of the Original Balance position held in DTC Segregated account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.";
			nextVersions_lazy = () -> Arrays.asList(AccountBalanceSD13.mmInvestmentUnpledgedBalance);
			previousVersion_lazy = () -> AccountBalanceSD4.mmInvestmentUnpledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	@XmlElement(name = "InvstmtPldgdBal")
	protected SignedQuantityFormat9 investmentPledgedBalance;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD13#mmInvestmentPledgedBalance
	 * AccountBalanceSD13.mmInvestmentPledgedBalance}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPledgedBalance";
			definition = "Portion of the Original Balance position held in DTC Investment account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.";
			nextVersions_lazy = () -> Arrays.asList(AccountBalanceSD13.mmInvestmentPledgedBalance);
			previousVersion_lazy = () -> AccountBalanceSD4.mmInvestmentPledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	@XmlElement(name = "AccptdBal")
	protected SignedQuantityFormat9 acceptedBalance;
	/**
	 * 
	 <p>
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
	 * "Balance that has been accepted by the issuer / agent for payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD13#mmAcceptedBalance
	 * AccountBalanceSD13.mmAcceptedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcceptedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "AccptdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedBalance";
			definition = "Balance that has been accepted by the issuer / agent for payment.";
			nextVersions_lazy = () -> Arrays.asList(AccountBalanceSD13.mmAcceptedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	@XmlElement(name = "UaccptdBal")
	protected SignedQuantityFormat9 unacceptedBalance;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD13#mmUnacceptedBalance
	 * AccountBalanceSD13.mmUnacceptedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnacceptedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "UaccptdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedBalance";
			definition = "Balance that has not been accepted by issuer / agent for payment.";
			nextVersions_lazy = () -> Arrays.asList(AccountBalanceSD13.mmUnacceptedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	@XmlElement(name = "OvrsbcptBal")
	protected SignedQuantityFormat9 oversubscriptionBalance;
	/**
	 * 
	 <p>
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
	 * "For Rights Subscription events, total number of oversubscribed units applicable to the payment or the subscription charge."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountBalanceSD13#mmOversubscriptionBalance
	 * AccountBalanceSD13.mmOversubscriptionBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOversubscriptionBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountBalanceSD9.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionBalance";
			definition = "For Rights Subscription events, total number of oversubscribed units applicable to the payment or the subscription charge.";
			nextVersions_lazy = () -> Arrays.asList(AccountBalanceSD13.mmOversubscriptionBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountBalanceSD9.mmPlaceAndName, com.tools20022.repository.msg.AccountBalanceSD9.mmOriginalBalance,
						com.tools20022.repository.msg.AccountBalanceSD9.mmUnpledgedBalance, com.tools20022.repository.msg.AccountBalanceSD9.mmInvestmentUnpledgedBalance,
						com.tools20022.repository.msg.AccountBalanceSD9.mmInvestmentPledgedBalance, com.tools20022.repository.msg.AccountBalanceSD9.mmAcceptedBalance, com.tools20022.repository.msg.AccountBalanceSD9.mmUnacceptedBalance,
						com.tools20022.repository.msg.AccountBalanceSD9.mmOversubscriptionBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountBalanceSD9";
				definition = "Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).";
				nextVersions_lazy = () -> Arrays.asList(AccountBalanceSD13.mmObject());
				previousVersion_lazy = () -> AccountBalanceSD4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public AccountBalanceSD9 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<SignedQuantityFormat9> getOriginalBalance() {
		return originalBalance == null ? Optional.empty() : Optional.of(originalBalance);
	}

	public AccountBalanceSD9 setOriginalBalance(com.tools20022.repository.msg.SignedQuantityFormat9 originalBalance) {
		this.originalBalance = originalBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getUnpledgedBalance() {
		return unpledgedBalance == null ? Optional.empty() : Optional.of(unpledgedBalance);
	}

	public AccountBalanceSD9 setUnpledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 unpledgedBalance) {
		this.unpledgedBalance = unpledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getInvestmentUnpledgedBalance() {
		return investmentUnpledgedBalance == null ? Optional.empty() : Optional.of(investmentUnpledgedBalance);
	}

	public AccountBalanceSD9 setInvestmentUnpledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 investmentUnpledgedBalance) {
		this.investmentUnpledgedBalance = investmentUnpledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getInvestmentPledgedBalance() {
		return investmentPledgedBalance == null ? Optional.empty() : Optional.of(investmentPledgedBalance);
	}

	public AccountBalanceSD9 setInvestmentPledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 investmentPledgedBalance) {
		this.investmentPledgedBalance = investmentPledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getAcceptedBalance() {
		return acceptedBalance == null ? Optional.empty() : Optional.of(acceptedBalance);
	}

	public AccountBalanceSD9 setAcceptedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 acceptedBalance) {
		this.acceptedBalance = acceptedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getUnacceptedBalance() {
		return unacceptedBalance == null ? Optional.empty() : Optional.of(unacceptedBalance);
	}

	public AccountBalanceSD9 setUnacceptedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 unacceptedBalance) {
		this.unacceptedBalance = unacceptedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOversubscriptionBalance() {
		return oversubscriptionBalance == null ? Optional.empty() : Optional.of(oversubscriptionBalance);
	}

	public AccountBalanceSD9 setOversubscriptionBalance(com.tools20022.repository.msg.SignedQuantityFormat9 oversubscriptionBalance) {
		this.oversubscriptionBalance = oversubscriptionBalance;
		return this;
	}
}
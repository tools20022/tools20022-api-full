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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#UnallocatedDistributionBalance
 * CorporateActionUnallocatedDetailsSD5.UnallocatedDistributionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#UnallocatedRedemptionBalance
 * CorporateActionUnallocatedDetailsSD5.UnallocatedRedemptionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#UnallocatedReorganisationBalance
 * CorporateActionUnallocatedDetailsSD5.UnallocatedReorganisationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#UnallocatedSecuritiesTransactionDetails
 * CorporateActionUnallocatedDetailsSD5.UnallocatedSecuritiesTransactionDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#UnallocatedCashTransactionDetails
 * CorporateActionUnallocatedDetailsSD5.UnallocatedCashTransactionDetails}</li>
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
 * "CorporateActionUnallocatedDetailsSD5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4
 * CorporateActionUnallocatedDetailsSD4}</li>
 * </ul>
 */
public class CorporateActionUnallocatedDetailsSD5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of Participants positions distribution balance concerned in
	 * unallocated payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
	 * CorporateActionUnallocatedBalanceSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdDstrbtnBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedDistributionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Participants positions distribution balance concerned in unallocated payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#UnallocatedDistributionBalance
	 * CorporateActionUnallocatedDetailsSD4.UnallocatedDistributionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UnallocatedDistributionBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdDstrbtnBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedDistributionBalance";
			definition = "Type of Participants positions distribution balance concerned in unallocated payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4.UnallocatedDistributionBalance;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Type of Participants positions redemption balance concerned in
	 * unallocated payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdRedBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedRedemptionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Participants positions redemption balance concerned in unallocated payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#UnallocatedRedemptionBalance
	 * CorporateActionUnallocatedDetailsSD4.UnallocatedRedemptionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UnallocatedRedemptionBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdRedBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedRedemptionBalance";
			definition = "Type of Participants positions redemption balance concerned in unallocated payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4.UnallocatedRedemptionBalance;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Type of participants positions reorganisation balance concerned in
	 * unallocated payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2
	 * CorporateActionUnallocatedBalanceSD2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdReorgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedReorganisationBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of participants positions reorganisation balance concerned in unallocated payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UnallocatedReorganisationBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdReorgBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedReorganisationBalance";
			definition = "Type of participants positions reorganisation balance concerned in unallocated payment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Details of the securities transactions concerned in unallocated payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD6
	 * CorporateActionUnallocatedSecuritiesTransactionDetailsSD6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdSctiesTxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedSecuritiesTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the securities transactions concerned in unallocated payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#UnallocatedSecuritiesTransactionDetails
	 * CorporateActionUnallocatedDetailsSD4.
	 * UnallocatedSecuritiesTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UnallocatedSecuritiesTransactionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdSctiesTxDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedSecuritiesTransactionDetails";
			definition = "Details of the securities transactions concerned in unallocated payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4.UnallocatedSecuritiesTransactionDetails;
			minOccurs = 0;
			type_lazy = () -> CorporateActionUnallocatedSecuritiesTransactionDetailsSD6.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Details of the cash transactions concerned in unallocated payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5
	 * CorporateActionUnallocatedCashTransactionDetailsSD5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdCshTxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedCashTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the cash transactions concerned in unallocated payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#UnallocatedCashTransactionDetails
	 * CorporateActionUnallocatedDetailsSD4.UnallocatedCashTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UnallocatedCashTransactionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdCshTxDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedCashTransactionDetails";
			definition = "Details of the cash transactions concerned in unallocated payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4.UnallocatedCashTransactionDetails;
			minOccurs = 0;
			type_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD5.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.UnallocatedDistributionBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.UnallocatedRedemptionBalance, com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.UnallocatedReorganisationBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.UnallocatedSecuritiesTransactionDetails, com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.UnallocatedCashTransactionDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionUnallocatedDetailsSD5";
				definition = "Provides additional information regarding the corporate action event.";
				previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
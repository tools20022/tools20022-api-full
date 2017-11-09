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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedDistributionBalance
 * CorporateActionUnallocatedDetailsSD5.mmUnallocatedDistributionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedRedemptionBalance
 * CorporateActionUnallocatedDetailsSD5.mmUnallocatedRedemptionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedReorganisationBalance
 * CorporateActionUnallocatedDetailsSD5.mmUnallocatedReorganisationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedSecuritiesTransactionDetails
 * CorporateActionUnallocatedDetailsSD5.
 * mmUnallocatedSecuritiesTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedCashTransactionDetails
 * CorporateActionUnallocatedDetailsSD5.mmUnallocatedCashTransactionDetails}</li>
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
	protected CorporateActionUnallocatedBalanceSD2Choice unallocatedDistributionBalance;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#mmUnallocatedDistributionBalance
	 * CorporateActionUnallocatedDetailsSD4.mmUnallocatedDistributionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnallocatedDistributionBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdDstrbtnBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedDistributionBalance";
			definition = "Type of Participants positions distribution balance concerned in unallocated payment.";
			previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmUnallocatedDistributionBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
		}
	};
	protected CorporateActionUnallocatedBalanceSD1 unallocatedRedemptionBalance;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#mmUnallocatedRedemptionBalance
	 * CorporateActionUnallocatedDetailsSD4.mmUnallocatedRedemptionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnallocatedRedemptionBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdRedBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedRedemptionBalance";
			definition = "Type of Participants positions redemption balance concerned in unallocated payment.";
			previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmUnallocatedRedemptionBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
		}
	};
	protected CorporateActionUnallocatedBalanceSD2 unallocatedReorganisationBalance;
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
	public static final MMMessageAssociationEnd mmUnallocatedReorganisationBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdReorgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedReorganisationBalance";
			definition = "Type of participants positions reorganisation balance concerned in unallocated payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD6> unallocatedSecuritiesTransactionDetails;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#mmUnallocatedSecuritiesTransactionDetails
	 * CorporateActionUnallocatedDetailsSD4.
	 * mmUnallocatedSecuritiesTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnallocatedSecuritiesTransactionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdSctiesTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedSecuritiesTransactionDetails";
			definition = "Details of the securities transactions concerned in unallocated payment.";
			previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmUnallocatedSecuritiesTransactionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5> unallocatedCashTransactionDetails;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#mmUnallocatedCashTransactionDetails
	 * CorporateActionUnallocatedDetailsSD4.mmUnallocatedCashTransactionDetails}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnallocatedCashTransactionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdCshTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedCashTransactionDetails";
			definition = "Details of the cash transactions concerned in unallocated payment.";
			previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmUnallocatedCashTransactionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD5.mmUnallocatedDistributionBalance, CorporateActionUnallocatedDetailsSD5.mmUnallocatedRedemptionBalance,
						CorporateActionUnallocatedDetailsSD5.mmUnallocatedReorganisationBalance, CorporateActionUnallocatedDetailsSD5.mmUnallocatedSecuritiesTransactionDetails,
						CorporateActionUnallocatedDetailsSD5.mmUnallocatedCashTransactionDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionUnallocatedDetailsSD5";
				definition = "Provides additional information regarding the corporate action event.";
				previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionUnallocatedBalanceSD2Choice getUnallocatedDistributionBalance() {
		return unallocatedDistributionBalance;
	}

	public void setUnallocatedDistributionBalance(CorporateActionUnallocatedBalanceSD2Choice unallocatedDistributionBalance) {
		this.unallocatedDistributionBalance = unallocatedDistributionBalance;
	}

	public CorporateActionUnallocatedBalanceSD1 getUnallocatedRedemptionBalance() {
		return unallocatedRedemptionBalance;
	}

	public void setUnallocatedRedemptionBalance(com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1 unallocatedRedemptionBalance) {
		this.unallocatedRedemptionBalance = unallocatedRedemptionBalance;
	}

	public CorporateActionUnallocatedBalanceSD2 getUnallocatedReorganisationBalance() {
		return unallocatedReorganisationBalance;
	}

	public void setUnallocatedReorganisationBalance(com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2 unallocatedReorganisationBalance) {
		this.unallocatedReorganisationBalance = unallocatedReorganisationBalance;
	}

	public List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD6> getUnallocatedSecuritiesTransactionDetails() {
		return unallocatedSecuritiesTransactionDetails;
	}

	public void setUnallocatedSecuritiesTransactionDetails(List<com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD6> unallocatedSecuritiesTransactionDetails) {
		this.unallocatedSecuritiesTransactionDetails = unallocatedSecuritiesTransactionDetails;
	}

	public List<CorporateActionUnallocatedCashTransactionDetailsSD5> getUnallocatedCashTransactionDetails() {
		return unallocatedCashTransactionDetails;
	}

	public void setUnallocatedCashTransactionDetails(List<com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5> unallocatedCashTransactionDetails) {
		this.unallocatedCashTransactionDetails = unallocatedCashTransactionDetails;
	}
}
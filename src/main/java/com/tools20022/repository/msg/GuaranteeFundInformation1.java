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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Owner and account number of the guarantee fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeFundInformation1#mmGuaranteeFundAccount
 * GuaranteeFundInformation1.mmGuaranteeFundAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeFundInformation1#mmGuaranteeFundAccountOwner
 * GuaranteeFundInformation1.mmGuaranteeFundAccountOwner}</li>
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
 * "GuaranteeFundInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Owner and account number of the guarantee fund."</li>
 * </ul>
 */
public class GuaranteeFundInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CashAccount24 guaranteeFundAccount;
	/**
	 * Guarantee fund account identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeFundInformation1
	 * GuaranteeFundInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntFndAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeFundAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee fund account identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGuaranteeFundAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> GuaranteeFundInformation1.mmObject();
			isDerived = false;
			xmlTag = "GrntFndAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeFundAccount";
			definition = "Guarantee fund account identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected FinancialInstitutionIdentification9 guaranteeFundAccountOwner;
	/**
	 * Owner identification of the guarantee fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9
	 * FinancialInstitutionIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeFundInformation1
	 * GuaranteeFundInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntFndAcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeFundAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner identification of the guarantee fund."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGuaranteeFundAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> GuaranteeFundInformation1.mmObject();
			isDerived = false;
			xmlTag = "GrntFndAcctOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeFundAccountOwner";
			definition = "Owner identification of the guarantee fund.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GuaranteeFundInformation1.mmGuaranteeFundAccount, com.tools20022.repository.msg.GuaranteeFundInformation1.mmGuaranteeFundAccountOwner);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GuaranteeFundInformation1";
				definition = "Owner and account number of the guarantee fund.";
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccount24 getGuaranteeFundAccount() {
		return guaranteeFundAccount;
	}

	public void setGuaranteeFundAccount(com.tools20022.repository.msg.CashAccount24 guaranteeFundAccount) {
		this.guaranteeFundAccount = guaranteeFundAccount;
	}

	public FinancialInstitutionIdentification9 getGuaranteeFundAccountOwner() {
		return guaranteeFundAccountOwner;
	}

	public void setGuaranteeFundAccountOwner(com.tools20022.repository.msg.FinancialInstitutionIdentification9 guaranteeFundAccountOwner) {
		this.guaranteeFundAccountOwner = guaranteeFundAccountOwner;
	}
}
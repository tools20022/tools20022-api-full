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
import com.tools20022.repository.choice.CollateralValueReportOrError2Choice;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Reports either on the collateral value report or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1#mmAccount
 * CollateralValueReport1.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1#mmSecuritiesAccountOwner
 * CollateralValueReport1.mmSecuritiesAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1#mmSecuritiesAccountServicer
 * CollateralValueReport1.mmSecuritiesAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1#mmCollateralValueReport
 * CollateralValueReport1.mmCollateralValueReport}</li>
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
 * "CollateralValueReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the collateral value report or on a business error."</li>
 * </ul>
 */
public class CollateralValueReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CashAccount25 account;
	/**
	 * Unique identification, as assigned by the account servicer, to
	 * unambiguously identify the account on which information is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount25
	 * CashAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1
	 * CollateralValueReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the account on which information is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralValueReport1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the account on which information is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount25.mmObject();
		}
	};
	protected PartyIdentification71Choice securitiesAccountOwner;
	/**
	 * Unique and unambiguous identification of the securities account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1
	 * CollateralValueReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the securities account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralValueReport1.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountOwner";
			definition = "Unique and unambiguous identification of the securities account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	protected PartyIdentification71Choice securitiesAccountServicer;
	/**
	 * Party that manages the securities account on behalf of the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1
	 * CollateralValueReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the securities account on behalf of the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesAccountServicer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralValueReport1.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountServicer";
			definition = "Party that manages the securities account on behalf of the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	protected List<CollateralValueReportOrError2Choice> collateralValueReport;
	/**
	 * Provides information specific to the report on collateral value
	 * positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError2Choice
	 * CollateralValueReportOrError2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1
	 * CollateralValueReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollValRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValueReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information specific to the report on collateral value positions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralValueReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralValueReport1.mmObject();
			isDerived = false;
			xmlTag = "CollValRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValueReport";
			definition = "Provides information specific to the report on collateral value positions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralValueReportOrError2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(CollateralValueReport1.mmAccount, CollateralValueReport1.mmSecuritiesAccountOwner, CollateralValueReport1.mmSecuritiesAccountServicer, CollateralValueReport1.mmCollateralValueReport);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValueReport1";
				definition = "Reports either on the collateral value report or on a business error.";
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccount25 getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.msg.CashAccount25 account) {
		this.account = account;
	}

	public PartyIdentification71Choice getSecuritiesAccountOwner() {
		return securitiesAccountOwner;
	}

	public void setSecuritiesAccountOwner(PartyIdentification71Choice securitiesAccountOwner) {
		this.securitiesAccountOwner = securitiesAccountOwner;
	}

	public PartyIdentification71Choice getSecuritiesAccountServicer() {
		return securitiesAccountServicer;
	}

	public void setSecuritiesAccountServicer(PartyIdentification71Choice securitiesAccountServicer) {
		this.securitiesAccountServicer = securitiesAccountServicer;
	}

	public List<CollateralValueReportOrError2Choice> getCollateralValueReport() {
		return collateralValueReport;
	}

	public void setCollateralValueReport(List<CollateralValueReportOrError2Choice> collateralValueReport) {
		this.collateralValueReport = collateralValueReport;
	}
}
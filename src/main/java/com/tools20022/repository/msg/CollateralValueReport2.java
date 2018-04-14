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
import com.tools20022.repository.choice.CollateralValueReportOrError4Choice;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount25;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.CollateralValueReport2#mmAccount
 * CollateralValueReport2.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueReport2#mmSecuritiesAccountOwner
 * CollateralValueReport2.mmSecuritiesAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueReport2#mmSecuritiesAccountServicer
 * CollateralValueReport2.mmSecuritiesAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueReport2#mmCollateralValueReport
 * CollateralValueReport2.mmCollateralValueReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValueReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the collateral value report or on a business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1
 * CollateralValueReport1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValueReport2", propOrder = {"account", "securitiesAccountOwner", "securitiesAccountServicer", "collateralValueReport"})
public class CollateralValueReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acct", required = true)
	protected CashAccount25 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount25
	 * CashAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport2
	 * CollateralValueReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the account on which information is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1#mmAccount
	 * CollateralValueReport1.mmAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueReport2, CashAccount25> mmAccount = new MMMessageAssociationEnd<CollateralValueReport2, CashAccount25>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueReport2.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the account on which information is requested.";
			previousVersion_lazy = () -> CollateralValueReport1.mmAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount25.mmObject();
		}

		@Override
		public CashAccount25 getValue(CollateralValueReport2 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(CollateralValueReport2 obj, CashAccount25 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "SctiesAcctOwnr")
	protected PartyIdentification71Choice securitiesAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport2
	 * CollateralValueReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the securities account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1#mmSecuritiesAccountOwner
	 * CollateralValueReport1.mmSecuritiesAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueReport2, Optional<PartyIdentification71Choice>> mmSecuritiesAccountOwner = new MMMessageAssociationEnd<CollateralValueReport2, Optional<PartyIdentification71Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueReport2.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountOwner";
			definition = "Unique and unambiguous identification of the securities account owner.";
			previousVersion_lazy = () -> CollateralValueReport1.mmSecuritiesAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CollateralValueReport2 obj) {
			return obj.getSecuritiesAccountOwner();
		}

		@Override
		public void setValue(CollateralValueReport2 obj, Optional<PartyIdentification71Choice> value) {
			obj.setSecuritiesAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesAcctSvcr")
	protected PartyIdentification71Choice securitiesAccountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport2
	 * CollateralValueReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the securities account on behalf of the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1#mmSecuritiesAccountServicer
	 * CollateralValueReport1.mmSecuritiesAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueReport2, Optional<PartyIdentification71Choice>> mmSecuritiesAccountServicer = new MMMessageAssociationEnd<CollateralValueReport2, Optional<PartyIdentification71Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueReport2.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountServicer";
			definition = "Party that manages the securities account on behalf of the account owner.";
			previousVersion_lazy = () -> CollateralValueReport1.mmSecuritiesAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CollateralValueReport2 obj) {
			return obj.getSecuritiesAccountServicer();
		}

		@Override
		public void setValue(CollateralValueReport2 obj, Optional<PartyIdentification71Choice> value) {
			obj.setSecuritiesAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "CollValRpt")
	protected List<CollateralValueReportOrError4Choice> collateralValueReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError4Choice
	 * CollateralValueReportOrError4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport2
	 * CollateralValueReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollValRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValueReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information specific to the report on collateral value positions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueReport1#mmCollateralValueReport
	 * CollateralValueReport1.mmCollateralValueReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueReport2, List<CollateralValueReportOrError4Choice>> mmCollateralValueReport = new MMMessageAssociationEnd<CollateralValueReport2, List<CollateralValueReportOrError4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueReport2.mmObject();
			isDerived = false;
			xmlTag = "CollValRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValueReport";
			definition = "Provides information specific to the report on collateral value positions.";
			previousVersion_lazy = () -> CollateralValueReport1.mmCollateralValueReport;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralValueReportOrError4Choice.mmObject();
		}

		@Override
		public List<CollateralValueReportOrError4Choice> getValue(CollateralValueReport2 obj) {
			return obj.getCollateralValueReport();
		}

		@Override
		public void setValue(CollateralValueReport2 obj, List<CollateralValueReportOrError4Choice> value) {
			obj.setCollateralValueReport(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValueReport2.mmAccount, com.tools20022.repository.msg.CollateralValueReport2.mmSecuritiesAccountOwner,
						com.tools20022.repository.msg.CollateralValueReport2.mmSecuritiesAccountServicer, com.tools20022.repository.msg.CollateralValueReport2.mmCollateralValueReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValueReport2";
				definition = "Reports either on the collateral value report or on a business error.";
				previousVersion_lazy = () -> CollateralValueReport1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccount25 getAccount() {
		return account;
	}

	public CollateralValueReport2 setAccount(CashAccount25 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<PartyIdentification71Choice> getSecuritiesAccountOwner() {
		return securitiesAccountOwner == null ? Optional.empty() : Optional.of(securitiesAccountOwner);
	}

	public CollateralValueReport2 setSecuritiesAccountOwner(PartyIdentification71Choice securitiesAccountOwner) {
		this.securitiesAccountOwner = securitiesAccountOwner;
		return this;
	}

	public Optional<PartyIdentification71Choice> getSecuritiesAccountServicer() {
		return securitiesAccountServicer == null ? Optional.empty() : Optional.of(securitiesAccountServicer);
	}

	public CollateralValueReport2 setSecuritiesAccountServicer(PartyIdentification71Choice securitiesAccountServicer) {
		this.securitiesAccountServicer = securitiesAccountServicer;
		return this;
	}

	public List<CollateralValueReportOrError4Choice> getCollateralValueReport() {
		return collateralValueReport == null ? collateralValueReport = new ArrayList<>() : collateralValueReport;
	}

	public CollateralValueReport2 setCollateralValueReport(List<CollateralValueReportOrError4Choice> collateralValueReport) {
		this.collateralValueReport = Objects.requireNonNull(collateralValueReport);
		return this;
	}
}
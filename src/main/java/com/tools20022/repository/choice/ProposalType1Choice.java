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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.CollateralProposal;
import com.tools20022.repository.entity.Money;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCollateral1;
import com.tools20022.repository.msg.OtherCollateral1;
import com.tools20022.repository.msg.SecuritiesCollateral1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between the type of collateral proposed for the margin call.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice#mmSecuritiesCollateral
 * ProposalType1Choice.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice#mmCashCollateral
 * ProposalType1Choice.mmCashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice#mmOtherCollateral
 * ProposalType1Choice.mmOtherCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralProposal
 * CollateralProposal}</li>
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
 * "ProposalType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the type of collateral proposed for the margin call."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProposalType1Choice", propOrder = {"securitiesCollateral", "cashCollateral", "otherCollateral"})
public class ProposalType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesColl")
	protected List<SecuritiesCollateral1> securitiesCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1
	 * SecuritiesCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice
	 * ProposalType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProposalType1Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateral";
			definition = "Collateral type is securities.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesCollateral1.mmObject();
		}
	};
	@XmlElement(name = "CshColl")
	protected List<CashCollateral1> cashCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Money Money}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice
	 * ProposalType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is cash."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Money.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProposalType1Choice.mmObject();
			isDerived = false;
			xmlTag = "CshColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateral";
			definition = "Collateral type is cash.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashCollateral1.mmObject();
		}
	};
	@XmlElement(name = "OthrColl")
	protected List<OtherCollateral1> otherCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherCollateral1
	 * OtherCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAsset
	 * AssetHolding.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice
	 * ProposalType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral type is other than securities or cash for example letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCollateral = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmAsset;
			componentContext_lazy = () -> com.tools20022.repository.choice.ProposalType1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateral";
			definition = "Collateral type is other than securities or cash for example letter of credit.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherCollateral1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProposalType1Choice.mmSecuritiesCollateral, com.tools20022.repository.choice.ProposalType1Choice.mmCashCollateral,
						com.tools20022.repository.choice.ProposalType1Choice.mmOtherCollateral);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ProposalType1Choice";
				definition = "Choice between the type of collateral proposed for the margin call.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesCollateral1> getSecuritiesCollateral() {
		return securitiesCollateral == null ? securitiesCollateral = new ArrayList<>() : securitiesCollateral;
	}

	public ProposalType1Choice setSecuritiesCollateral(List<SecuritiesCollateral1> securitiesCollateral) {
		this.securitiesCollateral = Objects.requireNonNull(securitiesCollateral);
		return this;
	}

	public List<CashCollateral1> getCashCollateral() {
		return cashCollateral == null ? cashCollateral = new ArrayList<>() : cashCollateral;
	}

	public ProposalType1Choice setCashCollateral(List<CashCollateral1> cashCollateral) {
		this.cashCollateral = Objects.requireNonNull(cashCollateral);
		return this;
	}

	public List<OtherCollateral1> getOtherCollateral() {
		return otherCollateral == null ? otherCollateral = new ArrayList<>() : otherCollateral;
	}

	public ProposalType1Choice setOtherCollateral(List<OtherCollateral1> otherCollateral) {
		this.otherCollateral = Objects.requireNonNull(otherCollateral);
		return this;
	}
}
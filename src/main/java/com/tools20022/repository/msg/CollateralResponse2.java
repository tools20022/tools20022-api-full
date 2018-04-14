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
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralProposal;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCollateralResponse2;
import com.tools20022.repository.msg.OtherCollateralResponse2;
import com.tools20022.repository.msg.SecuritiesCollateralResponse1;
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
 * Provides additional information on the collateral proposal(s), that is either
 * in cash, securities or other types.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralResponse2#mmSecuritiesCollateralResponse
 * CollateralResponse2.mmSecuritiesCollateralResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralResponse2#mmCashCollateralResponse
 * CollateralResponse2.mmCashCollateralResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralResponse2#mmOtherCollateralResponse
 * CollateralResponse2.mmOtherCollateralResponse}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information on the collateral proposal(s), that is either in cash, securities or other types."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCollateralResponsePresenceRule#forCollateralResponse2
 * ConstraintCollateralResponsePresenceRule.forCollateralResponse2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralResponse1
 * CollateralResponse1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralResponse2", propOrder = {"securitiesCollateralResponse", "cashCollateralResponse", "otherCollateralResponse"})
public class CollateralResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesCollRspn")
	protected List<SecuritiesCollateralResponse1> securitiesCollateralResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1
	 * SecuritiesCollateralResponse1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmStatus
	 * Collateral.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2
	 * CollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesCollRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateralResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the securities collateral proposal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#mmSecuritiesCollateralResponse
	 * CollateralResponse1.mmSecuritiesCollateralResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralResponse2, List<SecuritiesCollateralResponse1>> mmSecuritiesCollateralResponse = new MMMessageAssociationEnd<CollateralResponse2, List<SecuritiesCollateralResponse1>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "SctiesCollRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateralResponse";
			definition = "Provides details on the securities collateral proposal.";
			previousVersion_lazy = () -> CollateralResponse1.mmSecuritiesCollateralResponse;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesCollateralResponse1.mmObject();
		}

		@Override
		public List<SecuritiesCollateralResponse1> getValue(CollateralResponse2 obj) {
			return obj.getSecuritiesCollateralResponse();
		}

		@Override
		public void setValue(CollateralResponse2 obj, List<SecuritiesCollateralResponse1> value) {
			obj.setSecuritiesCollateralResponse(value);
		}
	};
	@XmlElement(name = "CshCollRspn")
	protected List<CashCollateralResponse2> cashCollateralResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2
	 * CashCollateralResponse2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmStatus
	 * Collateral.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2
	 * CollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshCollRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateralResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the cash collateral proposal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#mmCashCollateralResponse
	 * CollateralResponse1.mmCashCollateralResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralResponse2, List<CashCollateralResponse2>> mmCashCollateralResponse = new MMMessageAssociationEnd<CollateralResponse2, List<CashCollateralResponse2>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "CshCollRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateralResponse";
			definition = "Provides details on the cash collateral proposal.";
			previousVersion_lazy = () -> CollateralResponse1.mmCashCollateralResponse;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashCollateralResponse2.mmObject();
		}

		@Override
		public List<CashCollateralResponse2> getValue(CollateralResponse2 obj) {
			return obj.getCashCollateralResponse();
		}

		@Override
		public void setValue(CollateralResponse2 obj, List<CashCollateralResponse2> value) {
			obj.setCashCollateralResponse(value);
		}
	};
	@XmlElement(name = "OthrCollRspn")
	protected List<OtherCollateralResponse2> otherCollateralResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2
	 * OtherCollateralResponse2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmStatus
	 * Collateral.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2
	 * CollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCollRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateralResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on other collateral proposal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#mmOtherCollateralResponse
	 * CollateralResponse1.mmOtherCollateralResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralResponse2, List<OtherCollateralResponse2>> mmOtherCollateralResponse = new MMMessageAssociationEnd<CollateralResponse2, List<OtherCollateralResponse2>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "OthrCollRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateralResponse";
			definition = "Provides details on other collateral proposal.";
			previousVersion_lazy = () -> CollateralResponse1.mmOtherCollateralResponse;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherCollateralResponse2.mmObject();
		}

		@Override
		public List<OtherCollateralResponse2> getValue(CollateralResponse2 obj) {
			return obj.getOtherCollateralResponse();
		}

		@Override
		public void setValue(CollateralResponse2 obj, List<OtherCollateralResponse2> value) {
			obj.setOtherCollateralResponse(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralResponse2.mmSecuritiesCollateralResponse, com.tools20022.repository.msg.CollateralResponse2.mmCashCollateralResponse,
						com.tools20022.repository.msg.CollateralResponse2.mmOtherCollateralResponse);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCollateralResponsePresenceRule.forCollateralResponse2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralResponse2";
				definition = "Provides additional information on the collateral proposal(s), that is either in cash, securities or other types.";
				previousVersion_lazy = () -> CollateralResponse1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesCollateralResponse1> getSecuritiesCollateralResponse() {
		return securitiesCollateralResponse == null ? securitiesCollateralResponse = new ArrayList<>() : securitiesCollateralResponse;
	}

	public CollateralResponse2 setSecuritiesCollateralResponse(List<SecuritiesCollateralResponse1> securitiesCollateralResponse) {
		this.securitiesCollateralResponse = Objects.requireNonNull(securitiesCollateralResponse);
		return this;
	}

	public List<CashCollateralResponse2> getCashCollateralResponse() {
		return cashCollateralResponse == null ? cashCollateralResponse = new ArrayList<>() : cashCollateralResponse;
	}

	public CollateralResponse2 setCashCollateralResponse(List<CashCollateralResponse2> cashCollateralResponse) {
		this.cashCollateralResponse = Objects.requireNonNull(cashCollateralResponse);
		return this;
	}

	public List<OtherCollateralResponse2> getOtherCollateralResponse() {
		return otherCollateralResponse == null ? otherCollateralResponse = new ArrayList<>() : otherCollateralResponse;
	}

	public CollateralResponse2 setOtherCollateralResponse(List<OtherCollateralResponse2> otherCollateralResponse) {
		this.otherCollateralResponse = Objects.requireNonNull(otherCollateralResponse);
		return this;
	}
}
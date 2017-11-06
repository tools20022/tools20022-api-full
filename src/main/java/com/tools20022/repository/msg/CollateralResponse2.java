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
import com.tools20022.repository.entity.CollateralProposal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information on the collateral proposal(s), that is either in cash, securities or other types."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralResponse1
 * CollateralResponse1}</li>
 * </ul>
 */
public class CollateralResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.SecuritiesCollateralResponse1> securitiesCollateralResponse;
	/**
	 * Provides details on the securities collateral proposal.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateralResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the securities collateral proposal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#mmSecuritiesCollateralResponse
	 * CollateralResponse1.mmSecuritiesCollateralResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesCollateralResponse = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.mmStatus;
			componentContext_lazy = () -> CollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "SctiesCollRspn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateralResponse";
			definition = "Provides details on the securities collateral proposal.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CollateralResponse1.mmSecuritiesCollateralResponse;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesCollateralResponse1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashCollateralResponse2> cashCollateralResponse;
	/**
	 * Provides details on the cash collateral proposal.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateralResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the cash collateral proposal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#mmCashCollateralResponse
	 * CollateralResponse1.mmCashCollateralResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashCollateralResponse = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.mmStatus;
			componentContext_lazy = () -> CollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "CshCollRspn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateralResponse";
			definition = "Provides details on the cash collateral proposal.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CollateralResponse1.mmCashCollateralResponse;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashCollateralResponse2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.OtherCollateralResponse2> otherCollateralResponse;
	/**
	 * Provides details on other collateral proposal.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateralResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on other collateral proposal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#mmOtherCollateralResponse
	 * CollateralResponse1.mmOtherCollateralResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCollateralResponse = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.mmStatus;
			componentContext_lazy = () -> CollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "OthrCollRspn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateralResponse";
			definition = "Provides details on other collateral proposal.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CollateralResponse1.mmOtherCollateralResponse;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherCollateralResponse2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralResponse2.mmSecuritiesCollateralResponse, com.tools20022.repository.msg.CollateralResponse2.mmCashCollateralResponse,
						com.tools20022.repository.msg.CollateralResponse2.mmOtherCollateralResponse);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralResponse2";
				definition = "Provides additional information on the collateral proposal(s), that is either in cash, securities or other types.";
				previousVersion_lazy = () -> CollateralResponse1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesCollateralResponse1> getSecuritiesCollateralResponse() {
		return securitiesCollateralResponse;
	}

	public void setSecuritiesCollateralResponse(List<com.tools20022.repository.msg.SecuritiesCollateralResponse1> securitiesCollateralResponse) {
		this.securitiesCollateralResponse = securitiesCollateralResponse;
	}

	public List<CashCollateralResponse2> getCashCollateralResponse() {
		return cashCollateralResponse;
	}

	public void setCashCollateralResponse(List<com.tools20022.repository.msg.CashCollateralResponse2> cashCollateralResponse) {
		this.cashCollateralResponse = cashCollateralResponse;
	}

	public List<OtherCollateralResponse2> getOtherCollateralResponse() {
		return otherCollateralResponse;
	}

	public void setOtherCollateralResponse(List<com.tools20022.repository.msg.OtherCollateralResponse2> otherCollateralResponse) {
		this.otherCollateralResponse = otherCollateralResponse;
	}
}
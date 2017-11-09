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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Processes that reallocate corporate action proceeds to the entitled party and
 * that compensate financial penalties or indirect costs due to late delivery or
 * payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MarketClaim" src="doc-files/MarketClaim.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarketClaim
 * CorporateActionEvent.mmMarketClaim}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimAmount
 * MarketClaim.mmMarketClaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimTrackingEndDate
 * MarketClaim.mmMarketClaimTrackingEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmRelatedCorporateEvent
 * MarketClaim.mmRelatedCorporateEvent}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarketClaim"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processes that reallocate corporate action proceeds to the entitled party and that compensate financial penalties or indirect costs due to late delivery or payment."
 * </li>
 * </ul>
 */
public class MarketClaim {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount marketClaimAmount;
	/**
	 * Amount of money resulting from a market claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim MarketClaim}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmMarketClaimAmount
	 * CorporateActionAmounts2.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmMarketClaimAmount
	 * CorporateActionAmounts5.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmMarketClaimAmount
	 * CorporateActionAmounts11.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmMarketClaimAmount
	 * CorporateActionAmounts12.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmMarketClaimAmount
	 * CorporateActionAmounts17.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmMarketClaimAmount
	 * CorporateActionAmounts20.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmMarketClaimAmount
	 * CorporateActionAmounts23.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmMarketClaimAmount
	 * CorporateActionAmounts24.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmMarketClaimAmount
	 * CorporateActionAmounts3.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmMarketClaimAmount
	 * CorporateActionAmounts6.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmMarketClaimAmount
	 * CorporateActionAmounts9.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmMarketClaimAmount
	 * CorporateActionAmounts13.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmMarketClaimAmount
	 * CorporateActionAmounts16.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmMarketClaimAmount
	 * CorporateActionAmounts19.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmMarketClaimAmount
	 * CorporateActionAmounts22.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmMarketClaimAmount
	 * CorporateActionAmounts25.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmMarketClaimAmount
	 * CorporateActionAmounts1.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmMarketClaimAmount
	 * CorporateActionAmounts29.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmMarketClaimAmount
	 * CorporateActionAmounts28.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmMarketClaimAmount
	 * CorporateActionAmounts33.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmMarketClaimAmount
	 * CorporateActionAmounts35.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmMarketClaimAmount
	 * CorporateActionAmounts37.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmMarketClaimAmount
	 * CorporateActionAmounts38.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmMarketClaimAmount
	 * CorporateActionAmounts39.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmMarketClaimAmount
	 * CorporateActionAmounts40.mmMarketClaimAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money resulting from a market claim."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketClaimAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmMarketClaimAmount, CorporateActionAmounts5.mmMarketClaimAmount, CorporateActionAmounts11.mmMarketClaimAmount, CorporateActionAmounts12.mmMarketClaimAmount,
					CorporateActionAmounts17.mmMarketClaimAmount, CorporateActionAmounts20.mmMarketClaimAmount, CorporateActionAmounts23.mmMarketClaimAmount, CorporateActionAmounts24.mmMarketClaimAmount,
					CorporateActionAmounts3.mmMarketClaimAmount, CorporateActionAmounts6.mmMarketClaimAmount, CorporateActionAmounts9.mmMarketClaimAmount, CorporateActionAmounts13.mmMarketClaimAmount,
					CorporateActionAmounts16.mmMarketClaimAmount, CorporateActionAmounts19.mmMarketClaimAmount, CorporateActionAmounts22.mmMarketClaimAmount, CorporateActionAmounts25.mmMarketClaimAmount,
					CorporateActionAmounts1.mmMarketClaimAmount, CorporateActionAmounts29.mmMarketClaimAmount, CorporateActionAmounts28.mmMarketClaimAmount, CorporateActionAmounts33.mmMarketClaimAmount,
					CorporateActionAmounts35.mmMarketClaimAmount, CorporateActionAmounts37.mmMarketClaimAmount, CorporateActionAmounts38.mmMarketClaimAmount, CorporateActionAmounts39.mmMarketClaimAmount,
					CorporateActionAmounts40.mmMarketClaimAmount);
			elementContext_lazy = () -> MarketClaim.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaimAmount";
			definition = "Amount of money resulting from a market claim.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ISODateTime marketClaimTrackingEndDate;
	/**
	 * Date by which the depository stops monitoring activities of the event,
	 * for instance, accounting and tracking activities for due bills end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim MarketClaim}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmMarketClaimTrackingEndDate
	 * CorporateActionDate1.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmMarketClaimTrackingEndDate
	 * CorporateActionDate13.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmMarketClaimTrackingEndDate
	 * CorporateActionDate14.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmMarketClaimTrackingEndDate
	 * CorporateActionDate21.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmMarketClaimTrackingEndDate
	 * CorporateActionDate22.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmMarketClaimTrackingEndDate
	 * CorporateActionDate25.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmMarketClaimTrackingEndDate
	 * CorporateActionDate27.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmMarketClaimTrackingEndDate
	 * CorporateActionDate28.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmMarketClaimTrackingEndDate
	 * CorporateActionDate44.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmMarketClaimTrackingEndDate
	 * CorporateActionDate58.mmMarketClaimTrackingEndDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimTrackingEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketClaimTrackingEndDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmMarketClaimTrackingEndDate, CorporateActionDate13.mmMarketClaimTrackingEndDate, CorporateActionDate14.mmMarketClaimTrackingEndDate,
					CorporateActionDate21.mmMarketClaimTrackingEndDate, CorporateActionDate22.mmMarketClaimTrackingEndDate, CorporateActionDate25.mmMarketClaimTrackingEndDate, CorporateActionDate27.mmMarketClaimTrackingEndDate,
					CorporateActionDate28.mmMarketClaimTrackingEndDate, CorporateActionDate44.mmMarketClaimTrackingEndDate, CorporateActionDate58.mmMarketClaimTrackingEndDate);
			elementContext_lazy = () -> MarketClaim.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaimTrackingEndDate";
			definition = "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CorporateActionEvent relatedCorporateEvent;
	/**
	 * Corporate event for which market claim information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarketClaim
	 * CorporateActionEvent.mmMarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim MarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which market claim information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarketClaim.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which market claim information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmMarketClaim;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketClaim";
				definition = "Processes that reallocate corporate action proceeds to the entitled party and that compensate financial penalties or indirect costs due to late delivery or payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmMarketClaim);
				element_lazy = () -> Arrays.asList(MarketClaim.mmMarketClaimAmount, MarketClaim.mmMarketClaimTrackingEndDate, MarketClaim.mmRelatedCorporateEvent);
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getMarketClaimAmount() {
		return marketClaimAmount;
	}

	public void setMarketClaimAmount(CurrencyAndAmount marketClaimAmount) {
		this.marketClaimAmount = marketClaimAmount;
	}

	public ISODateTime getMarketClaimTrackingEndDate() {
		return marketClaimTrackingEndDate;
	}

	public void setMarketClaimTrackingEndDate(ISODateTime marketClaimTrackingEndDate) {
		this.marketClaimTrackingEndDate = marketClaimTrackingEndDate;
	}

	public CorporateActionEvent getRelatedCorporateEvent() {
		return relatedCorporateEvent;
	}

	public void setRelatedCorporateEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateEvent) {
		this.relatedCorporateEvent = relatedCorporateEvent;
	}
}
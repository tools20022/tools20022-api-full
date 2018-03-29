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
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarketClaim
 * CorporateActionEvent.mmMarketClaim}</li>
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
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmMarketClaimAmount
	 * CorporateActionAmounts43.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmMarketClaimAmount
	 * CorporateActionAmounts44.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmMarketClaimAmount
	 * CorporateActionAmounts45.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmMarketClaimAmount
	 * CorporateActionAmounts46.mmMarketClaimAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim MarketClaim}</li>
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
	public static final MMBusinessAttribute<MarketClaim, CurrencyAndAmount> mmMarketClaimAmount = new MMBusinessAttribute<MarketClaim, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmMarketClaimAmount, CorporateActionAmounts5.mmMarketClaimAmount, CorporateActionAmounts11.mmMarketClaimAmount, CorporateActionAmounts12.mmMarketClaimAmount,
					CorporateActionAmounts17.mmMarketClaimAmount, CorporateActionAmounts20.mmMarketClaimAmount, CorporateActionAmounts23.mmMarketClaimAmount, CorporateActionAmounts24.mmMarketClaimAmount,
					CorporateActionAmounts3.mmMarketClaimAmount, CorporateActionAmounts6.mmMarketClaimAmount, CorporateActionAmounts9.mmMarketClaimAmount, CorporateActionAmounts13.mmMarketClaimAmount,
					CorporateActionAmounts16.mmMarketClaimAmount, CorporateActionAmounts19.mmMarketClaimAmount, CorporateActionAmounts22.mmMarketClaimAmount, CorporateActionAmounts25.mmMarketClaimAmount,
					CorporateActionAmounts1.mmMarketClaimAmount, CorporateActionAmounts29.mmMarketClaimAmount, CorporateActionAmounts28.mmMarketClaimAmount, CorporateActionAmounts33.mmMarketClaimAmount,
					CorporateActionAmounts35.mmMarketClaimAmount, CorporateActionAmounts37.mmMarketClaimAmount, CorporateActionAmounts38.mmMarketClaimAmount, CorporateActionAmounts39.mmMarketClaimAmount,
					CorporateActionAmounts40.mmMarketClaimAmount, CorporateActionAmounts43.mmMarketClaimAmount, CorporateActionAmounts44.mmMarketClaimAmount, CorporateActionAmounts45.mmMarketClaimAmount,
					CorporateActionAmounts46.mmMarketClaimAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaimAmount";
			definition = "Amount of money resulting from a market claim.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarketClaim obj) {
			return obj.getMarketClaimAmount();
		}

		@Override
		public void setValue(MarketClaim obj, CurrencyAndAmount value) {
			obj.setMarketClaimAmount(value);
		}
	};
	protected ISODateTime marketClaimTrackingEndDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmMarketClaimTrackingEndDate
	 * CorporateActionDate61.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmMarketClaimTrackingEndDate
	 * CorporateActionDate74.mmMarketClaimTrackingEndDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim MarketClaim}</li>
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
	public static final MMBusinessAttribute<MarketClaim, ISODateTime> mmMarketClaimTrackingEndDate = new MMBusinessAttribute<MarketClaim, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmMarketClaimTrackingEndDate, CorporateActionDate13.mmMarketClaimTrackingEndDate, CorporateActionDate14.mmMarketClaimTrackingEndDate,
					CorporateActionDate21.mmMarketClaimTrackingEndDate, CorporateActionDate22.mmMarketClaimTrackingEndDate, CorporateActionDate25.mmMarketClaimTrackingEndDate, CorporateActionDate27.mmMarketClaimTrackingEndDate,
					CorporateActionDate28.mmMarketClaimTrackingEndDate, CorporateActionDate44.mmMarketClaimTrackingEndDate, CorporateActionDate58.mmMarketClaimTrackingEndDate, CorporateActionDate61.mmMarketClaimTrackingEndDate,
					CorporateActionDate74.mmMarketClaimTrackingEndDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaimTrackingEndDate";
			definition = "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(MarketClaim obj) {
			return obj.getMarketClaimTrackingEndDate();
		}

		@Override
		public void setValue(MarketClaim obj, ISODateTime value) {
			obj.setMarketClaimTrackingEndDate(value);
		}
	};
	protected CorporateActionEvent relatedCorporateEvent;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<MarketClaim, Optional<CorporateActionEvent>> mmRelatedCorporateEvent = new MMBusinessAssociationEnd<MarketClaim, Optional<CorporateActionEvent>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which market claim information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmMarketClaim;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public Optional<CorporateActionEvent> getValue(MarketClaim obj) {
			return obj.getRelatedCorporateEvent();
		}

		@Override
		public void setValue(MarketClaim obj, Optional<CorporateActionEvent> value) {
			obj.setRelatedCorporateEvent(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketClaim";
				definition = "Processes that reallocate corporate action proceeds to the entitled party and that compensate financial penalties or indirect costs due to late delivery or payment.";
				associationDomain_lazy = () -> Arrays.asList(CorporateActionEvent.mmMarketClaim);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarketClaim.mmMarketClaimAmount, com.tools20022.repository.entity.MarketClaim.mmMarketClaimTrackingEndDate,
						com.tools20022.repository.entity.MarketClaim.mmRelatedCorporateEvent);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarketClaim.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getMarketClaimAmount() {
		return marketClaimAmount;
	}

	public MarketClaim setMarketClaimAmount(CurrencyAndAmount marketClaimAmount) {
		this.marketClaimAmount = Objects.requireNonNull(marketClaimAmount);
		return this;
	}

	public ISODateTime getMarketClaimTrackingEndDate() {
		return marketClaimTrackingEndDate;
	}

	public MarketClaim setMarketClaimTrackingEndDate(ISODateTime marketClaimTrackingEndDate) {
		this.marketClaimTrackingEndDate = Objects.requireNonNull(marketClaimTrackingEndDate);
		return this;
	}

	public Optional<CorporateActionEvent> getRelatedCorporateEvent() {
		return relatedCorporateEvent == null ? Optional.empty() : Optional.of(relatedCorporateEvent);
	}

	public MarketClaim setRelatedCorporateEvent(CorporateActionEvent relatedCorporateEvent) {
		this.relatedCorporateEvent = relatedCorporateEvent;
		return this;
	}
}
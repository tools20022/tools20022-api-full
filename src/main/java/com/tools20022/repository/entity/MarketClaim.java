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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#MarketClaimAmount
 * MarketClaim.MarketClaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#MarketClaimTrackingEndDate
 * MarketClaim.MarketClaimTrackingEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#RelatedCorporateEvent
 * MarketClaim.RelatedCorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MarketClaim
 * CorporateActionEvent.MarketClaim}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#MarketClaimAmount
	 * CorporateActionAmounts2.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#MarketClaimAmount
	 * CorporateActionAmounts5.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#MarketClaimAmount
	 * CorporateActionAmounts11.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#MarketClaimAmount
	 * CorporateActionAmounts12.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#MarketClaimAmount
	 * CorporateActionAmounts17.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#MarketClaimAmount
	 * CorporateActionAmounts20.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#MarketClaimAmount
	 * CorporateActionAmounts23.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#MarketClaimAmount
	 * CorporateActionAmounts24.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#MarketClaimAmount
	 * CorporateActionAmounts3.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#MarketClaimAmount
	 * CorporateActionAmounts6.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#MarketClaimAmount
	 * CorporateActionAmounts9.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#MarketClaimAmount
	 * CorporateActionAmounts13.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#MarketClaimAmount
	 * CorporateActionAmounts16.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#MarketClaimAmount
	 * CorporateActionAmounts19.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#MarketClaimAmount
	 * CorporateActionAmounts22.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#MarketClaimAmount
	 * CorporateActionAmounts25.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#MarketClaimAmount
	 * CorporateActionAmounts1.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#MarketClaimAmount
	 * CorporateActionAmounts29.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#MarketClaimAmount
	 * CorporateActionAmounts28.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#MarketClaimAmount
	 * CorporateActionAmounts33.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#MarketClaimAmount
	 * CorporateActionAmounts35.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#MarketClaimAmount
	 * CorporateActionAmounts37.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#MarketClaimAmount
	 * CorporateActionAmounts38.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#MarketClaimAmount
	 * CorporateActionAmounts39.MarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#MarketClaimAmount
	 * CorporateActionAmounts40.MarketClaimAmount}</li>
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
	public static final MMBusinessAttribute MarketClaimAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts5.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts12.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts20.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts24.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts6.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts9.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts13.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts16.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts19.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts22.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts25.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts1.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts29.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts28.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts35.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts37.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts38.MarketClaimAmount,
					com.tools20022.repository.msg.CorporateActionAmounts39.MarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts40.MarketClaimAmount);
			elementContext_lazy = () -> MarketClaim.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClaimAmount";
			definition = "Amount of money resulting from a market claim.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#MarketClaimTrackingEndDate
	 * CorporateActionDate1.MarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#MarketClaimTrackingEndDate
	 * CorporateActionDate13.MarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#MarketClaimTrackingEndDate
	 * CorporateActionDate14.MarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#MarketClaimTrackingEndDate
	 * CorporateActionDate21.MarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#MarketClaimTrackingEndDate
	 * CorporateActionDate22.MarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#MarketClaimTrackingEndDate
	 * CorporateActionDate25.MarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#MarketClaimTrackingEndDate
	 * CorporateActionDate27.MarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#MarketClaimTrackingEndDate
	 * CorporateActionDate28.MarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#MarketClaimTrackingEndDate
	 * CorporateActionDate44.MarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#MarketClaimTrackingEndDate
	 * CorporateActionDate58.MarketClaimTrackingEndDate}</li>
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
	public static final MMBusinessAttribute MarketClaimTrackingEndDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.MarketClaimTrackingEndDate, com.tools20022.repository.msg.CorporateActionDate13.MarketClaimTrackingEndDate,
					com.tools20022.repository.msg.CorporateActionDate14.MarketClaimTrackingEndDate, com.tools20022.repository.msg.CorporateActionDate21.MarketClaimTrackingEndDate,
					com.tools20022.repository.msg.CorporateActionDate22.MarketClaimTrackingEndDate, com.tools20022.repository.msg.CorporateActionDate25.MarketClaimTrackingEndDate,
					com.tools20022.repository.msg.CorporateActionDate27.MarketClaimTrackingEndDate, com.tools20022.repository.msg.CorporateActionDate28.MarketClaimTrackingEndDate,
					com.tools20022.repository.msg.CorporateActionDate44.MarketClaimTrackingEndDate, com.tools20022.repository.msg.CorporateActionDate58.MarketClaimTrackingEndDate);
			elementContext_lazy = () -> MarketClaim.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClaimTrackingEndDate";
			definition = "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Corporate event for which market claim information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MarketClaim
	 * CorporateActionEvent.MarketClaim}</li>
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
	public static final MMBusinessAssociationEnd RelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarketClaim.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which market claim information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.MarketClaim;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketClaim";
				definition = "Processes that reallocate corporate action proceeds to the entitled party and that compensate financial penalties or indirect costs due to late delivery or payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.MarketClaim);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarketClaim.MarketClaimAmount, com.tools20022.repository.entity.MarketClaim.MarketClaimTrackingEndDate,
						com.tools20022.repository.entity.MarketClaim.RelatedCorporateEvent);
			}
		});
		return mmObject_lazy.get();
	}
}
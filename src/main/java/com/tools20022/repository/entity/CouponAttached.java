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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3NumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Physical certificates representing rights attached to the physical
 * certificates representing a security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CouponAttached" src="doc-files/CouponAttached.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#Date
 * CouponAttached.Date}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#Number
 * CouponAttached.Number}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#Security
 * CouponAttached.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CouponAttached#CouponClippingDate
 * CouponAttached.CouponClippingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CouponAttached#Identification
 * CouponAttached.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CouponAttached
 * Security.CouponAttached}</li>
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
 * "CouponAttached"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Physical certificates representing rights attached to the physical certificates representing a security."
 * </li>
 * </ul>
 */
public class CouponAttached {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date of the coupon attached to the physical security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#CouponDate
	 * FinancialInstrumentAttributes8.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#CouponDate
	 * FinancialInstrumentAttributes20.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#CouponDate
	 * FinancialInstrumentAttributes35.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#CouponDate
	 * FinancialInstrumentAttributes41.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#CouponDate
	 * FinancialInstrumentAttributes4.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#CouponDate
	 * FinancialInstrumentAttributes13.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#CouponDate
	 * FinancialInstrumentAttributes21.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#CouponDate
	 * FinancialInstrumentAttributes26.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#CouponDate
	 * FinancialInstrumentAttributes36.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#CouponDate
	 * FinancialInstrumentAttributes42.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#CouponDate
	 * FinancialInstrumentAttributes27.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#CouponDate
	 * FinancialInstrumentAttributes14.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#CouponDate
	 * FinancialInstrumentAttributes30.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#CouponDate
	 * FinancialInstrumentAttributes28.CouponDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#NextCouponDate
	 * Debt1.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#CouponDate
	 * FinancialInstrumentAttributes31.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#CouponDate
	 * FinancialInstrumentAttributes44.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#CouponDate
	 * FinancialInstrumentAttributes15.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#CouponDate
	 * FinancialInstrumentAttributes29.CouponDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#NextCouponDate
	 * Debt2.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#CouponDate
	 * FinancialInstrumentAttributes2.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#CouponDate
	 * FinancialInstrumentAttributes63.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#CouponDate
	 * FinancialInstrumentAttributes64.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#CouponDate
	 * FinancialInstrumentAttributes75.CouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#CouponDate
	 * FinancialInstrumentAttributes78.CouponDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the coupon attached to the physical security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.CouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.CouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes13.CouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes26.CouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes42.CouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes14.CouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes28.CouponDate, com.tools20022.repository.msg.Debt1.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.CouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes29.CouponDate, com.tools20022.repository.msg.Debt2.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes63.CouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.CouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes75.CouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.CouponDate);
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date of the coupon attached to the physical security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Number of the coupon attached to the physical security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#CouponAttachedNumber
	 * FinancialInstrumentAttributes8.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#CouponAttachedNumber
	 * FinancialInstrumentAttributes20.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#CouponAttachedNumber
	 * FinancialInstrumentAttributes35.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#CouponAttachedNumber
	 * FinancialInstrumentAttributes41.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#CouponNumber
	 * CorporateAction3.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#CouponNumber
	 * CorporateAction4.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#CouponNumber
	 * CorporateAction5.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#CouponNumber
	 * CorporateAction6.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#CouponNumber
	 * CorporateAction7.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#CouponNumber
	 * CorporateAction8.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#CouponNumber
	 * CorporateAction10.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#CouponNumber
	 * CorporateAction11.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#CouponAttachedNumber
	 * FinancialInstrumentAttributes4.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#CouponAttachedNumber
	 * FinancialInstrumentAttributes13.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#CouponAttachedNumber
	 * FinancialInstrumentAttributes21.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#CouponAttachedNumber
	 * FinancialInstrumentAttributes26.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#CouponAttachedNumber
	 * FinancialInstrumentAttributes36.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#CouponAttachedNumber
	 * FinancialInstrumentAttributes42.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#CouponAttachedNumber
	 * FinancialInstrumentAttributes27.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#CouponAttachedNumber
	 * FinancialInstrumentAttributes14.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#CouponAttachedNumber
	 * FinancialInstrumentAttributes30.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#CouponAttachedNumber
	 * FinancialInstrumentAttributes28.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#CouponAttachedNumber
	 * FinancialInstrumentAttributes1.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#CouponAttachedNumber
	 * FinancialInstrumentAttributes31.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#CouponAttachedNumber
	 * FinancialInstrumentAttributes44.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#CouponNumber
	 * CorporateAction2.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#CouponAttachedNumber
	 * FinancialInstrumentAttributes15.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#CouponAttachedNumber
	 * FinancialInstrumentAttributes29.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#CouponAttachedNumber
	 * CommonFinancialInstrumentAttributes1.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#CouponAttachedNumber
	 * FinancialInstrumentAttributes2.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#CouponNumber
	 * CorporateAction12.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#CouponNumber
	 * CorporateAction17.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#CouponAttachedNumber
	 * FinancialInstrumentAttributes63.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#CouponAttachedNumber
	 * FinancialInstrumentAttributes64.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#CouponNumber
	 * CorporateAction31.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#CouponNumber
	 * CorporateAction40.CouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#CouponAttachedNumber
	 * FinancialInstrumentAttributes75.CouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#CouponAttachedNumber
	 * FinancialInstrumentAttributes78.CouponAttachedNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached to the physical security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Number = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.CouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes20.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.CouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes41.CouponAttachedNumber,
					com.tools20022.repository.msg.CorporateAction3.CouponNumber, com.tools20022.repository.msg.CorporateAction4.CouponNumber, com.tools20022.repository.msg.CorporateAction5.CouponNumber,
					com.tools20022.repository.msg.CorporateAction6.CouponNumber, com.tools20022.repository.msg.CorporateAction7.CouponNumber, com.tools20022.repository.msg.CorporateAction8.CouponNumber,
					com.tools20022.repository.msg.CorporateAction10.CouponNumber, com.tools20022.repository.msg.CorporateAction11.CouponNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes4.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.CouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes21.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.CouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes36.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.CouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes27.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.CouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes30.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes28.CouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes1.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.CouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes44.CouponAttachedNumber,
					com.tools20022.repository.msg.CorporateAction2.CouponNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes15.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.CouponAttachedNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.CouponAttachedNumber, com.tools20022.repository.msg.CorporateAction12.CouponNumber, com.tools20022.repository.msg.CorporateAction17.CouponNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.CouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes64.CouponAttachedNumber,
					com.tools20022.repository.msg.CorporateAction31.CouponNumber, com.tools20022.repository.msg.CorporateAction40.CouponNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes75.CouponAttachedNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.CouponAttachedNumber);
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number of the coupon attached to the physical security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Instrument to which a coupon is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#CouponAttached
	 * Security.CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instrument to which a coupon is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Instrument to which a coupon is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CouponAttached;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which the coupons are to be/were submitted for payment of
	 * interest.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#CouponClippingDate
	 * CorporateActionDate4.CouponClippingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponClippingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the coupons are to be/were submitted for payment of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CouponClippingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate4.CouponClippingDate);
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CouponClippingDate";
			definition = "Date on which the coupons are to be/were submitted for payment of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identification of the coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the coupon."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the coupon.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CouponAttached";
				definition = "Physical certificates representing rights attached to the physical certificates representing a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CouponAttached);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CouponAttached.Date, com.tools20022.repository.entity.CouponAttached.Number, com.tools20022.repository.entity.CouponAttached.Security,
						com.tools20022.repository.entity.CouponAttached.CouponClippingDate, com.tools20022.repository.entity.CouponAttached.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}
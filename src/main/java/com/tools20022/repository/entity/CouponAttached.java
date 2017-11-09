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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
 * Security.mmCouponAttached}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#mmDate
 * CouponAttached.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
 * CouponAttached.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#mmSecurity
 * CouponAttached.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmCouponClippingDate
 * CouponAttached.mmCouponClippingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmIdentification
 * CouponAttached.mmIdentification}</li>
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
 * "CouponAttached"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Physical certificates representing rights attached to the physical certificates representing a security."
 * </li>
 * </ul>
 */
public class CouponAttached {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate date;
	/**
	 * Date of the coupon attached to the physical security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmCouponDate
	 * FinancialInstrumentAttributes8.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmCouponDate
	 * FinancialInstrumentAttributes20.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmCouponDate
	 * FinancialInstrumentAttributes35.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmCouponDate
	 * FinancialInstrumentAttributes41.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmCouponDate
	 * FinancialInstrumentAttributes4.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmCouponDate
	 * FinancialInstrumentAttributes13.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmCouponDate
	 * FinancialInstrumentAttributes21.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmCouponDate
	 * FinancialInstrumentAttributes26.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmCouponDate
	 * FinancialInstrumentAttributes36.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmCouponDate
	 * FinancialInstrumentAttributes42.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmCouponDate
	 * FinancialInstrumentAttributes27.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmCouponDate
	 * FinancialInstrumentAttributes14.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmCouponDate
	 * FinancialInstrumentAttributes30.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmCouponDate
	 * FinancialInstrumentAttributes28.mmCouponDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextCouponDate
	 * Debt1.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmCouponDate
	 * FinancialInstrumentAttributes31.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmCouponDate
	 * FinancialInstrumentAttributes44.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmCouponDate
	 * FinancialInstrumentAttributes15.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmCouponDate
	 * FinancialInstrumentAttributes29.mmCouponDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextCouponDate
	 * Debt2.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmCouponDate
	 * FinancialInstrumentAttributes2.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmCouponDate
	 * FinancialInstrumentAttributes63.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmCouponDate
	 * FinancialInstrumentAttributes64.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmCouponDate
	 * FinancialInstrumentAttributes75.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmCouponDate
	 * FinancialInstrumentAttributes78.mmCouponDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmCouponDate, FinancialInstrumentAttributes20.mmCouponDate, FinancialInstrumentAttributes35.mmCouponDate, FinancialInstrumentAttributes41.mmCouponDate,
					FinancialInstrumentAttributes4.mmCouponDate, FinancialInstrumentAttributes13.mmCouponDate, FinancialInstrumentAttributes21.mmCouponDate, FinancialInstrumentAttributes26.mmCouponDate,
					FinancialInstrumentAttributes36.mmCouponDate, FinancialInstrumentAttributes42.mmCouponDate, FinancialInstrumentAttributes27.mmCouponDate, FinancialInstrumentAttributes14.mmCouponDate,
					FinancialInstrumentAttributes30.mmCouponDate, FinancialInstrumentAttributes28.mmCouponDate, Debt1.mmNextCouponDate, FinancialInstrumentAttributes31.mmCouponDate, FinancialInstrumentAttributes44.mmCouponDate,
					FinancialInstrumentAttributes15.mmCouponDate, FinancialInstrumentAttributes29.mmCouponDate, Debt2.mmNextCouponDate, FinancialInstrumentAttributes2.mmCouponDate, FinancialInstrumentAttributes63.mmCouponDate,
					FinancialInstrumentAttributes64.mmCouponDate, FinancialInstrumentAttributes75.mmCouponDate, FinancialInstrumentAttributes78.mmCouponDate);
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max3NumericText number;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes8.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes20.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes35.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes41.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmCouponNumber
	 * CorporateAction3.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmCouponNumber
	 * CorporateAction4.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCouponNumber
	 * CorporateAction5.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmCouponNumber
	 * CorporateAction6.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmCouponNumber
	 * CorporateAction7.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmCouponNumber
	 * CorporateAction8.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmCouponNumber
	 * CorporateAction10.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmCouponNumber
	 * CorporateAction11.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes4.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes13.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes21.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes26.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes36.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes42.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes27.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes14.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes30.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes28.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes1.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes31.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes44.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCouponNumber
	 * CorporateAction2.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes15.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes29.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmCouponAttachedNumber
	 * CommonFinancialInstrumentAttributes1.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes2.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmCouponNumber
	 * CorporateAction12.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmCouponNumber
	 * CorporateAction17.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes63.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes64.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmCouponNumber
	 * CorporateAction31.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmCouponNumber
	 * CorporateAction40.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes75.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes78.mmCouponAttachedNumber}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmCouponAttachedNumber, FinancialInstrumentAttributes20.mmCouponAttachedNumber, FinancialInstrumentAttributes35.mmCouponAttachedNumber,
					FinancialInstrumentAttributes41.mmCouponAttachedNumber, CorporateAction3.mmCouponNumber, CorporateAction4.mmCouponNumber, CorporateAction5.mmCouponNumber, CorporateAction6.mmCouponNumber,
					CorporateAction7.mmCouponNumber, CorporateAction8.mmCouponNumber, CorporateAction10.mmCouponNumber, CorporateAction11.mmCouponNumber, FinancialInstrumentAttributes4.mmCouponAttachedNumber,
					FinancialInstrumentAttributes13.mmCouponAttachedNumber, FinancialInstrumentAttributes21.mmCouponAttachedNumber, FinancialInstrumentAttributes26.mmCouponAttachedNumber,
					FinancialInstrumentAttributes36.mmCouponAttachedNumber, FinancialInstrumentAttributes42.mmCouponAttachedNumber, FinancialInstrumentAttributes27.mmCouponAttachedNumber,
					FinancialInstrumentAttributes14.mmCouponAttachedNumber, FinancialInstrumentAttributes30.mmCouponAttachedNumber, FinancialInstrumentAttributes28.mmCouponAttachedNumber,
					FinancialInstrumentAttributes1.mmCouponAttachedNumber, FinancialInstrumentAttributes31.mmCouponAttachedNumber, FinancialInstrumentAttributes44.mmCouponAttachedNumber, CorporateAction2.mmCouponNumber,
					FinancialInstrumentAttributes15.mmCouponAttachedNumber, FinancialInstrumentAttributes29.mmCouponAttachedNumber, CommonFinancialInstrumentAttributes1.mmCouponAttachedNumber,
					FinancialInstrumentAttributes2.mmCouponAttachedNumber, CorporateAction12.mmCouponNumber, CorporateAction17.mmCouponNumber, FinancialInstrumentAttributes63.mmCouponAttachedNumber,
					FinancialInstrumentAttributes64.mmCouponAttachedNumber, CorporateAction31.mmCouponNumber, CorporateAction40.mmCouponNumber, FinancialInstrumentAttributes75.mmCouponAttachedNumber,
					FinancialInstrumentAttributes78.mmCouponAttachedNumber);
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected Security security;
	/**
	 * Instrument to which a coupon is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
	 * Security.mmCouponAttached}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Instrument to which a coupon is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmCouponAttached;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected ISODateTime couponClippingDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmCouponClippingDate
	 * CorporateActionDate4.mmCouponClippingDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCouponClippingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmCouponClippingDate);
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CouponClippingDate";
			definition = "Date on which the coupons are to be/were submitted for payment of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max35Text identification;
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CouponAttached.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the coupon.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CouponAttached";
				definition = "Physical certificates representing rights attached to the physical certificates representing a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmCouponAttached);
				element_lazy = () -> Arrays.asList(CouponAttached.mmDate, CouponAttached.mmNumber, CouponAttached.mmSecurity, CouponAttached.mmCouponClippingDate, CouponAttached.mmIdentification);
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	public Max3NumericText getNumber() {
		return number;
	}

	public void setNumber(Max3NumericText number) {
		this.number = number;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
	}

	public ISODateTime getCouponClippingDate() {
		return couponClippingDate;
	}

	public void setCouponClippingDate(ISODateTime couponClippingDate) {
		this.couponClippingDate = couponClippingDate;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}
}
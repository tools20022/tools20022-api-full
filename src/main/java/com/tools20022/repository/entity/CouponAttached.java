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
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
 * Security.mmCouponAttached}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CouponAttached"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Physical certificates representing rights attached to the physical certificates representing a security."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CouponAttached {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate date;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmNextCouponDate
	 * Debt3.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmCouponDate
	 * FinancialInstrumentAttributes91.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmCouponDate
	 * FinancialInstrumentAttributes92.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmCouponDate
	 * FinancialInstrumentAttributes95.mmCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmCouponDate
	 * FinancialInstrumentAttributes97.mmCouponDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the coupon attached to the physical security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CouponAttached, ISODate> mmDate = new MMBusinessAttribute<CouponAttached, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmCouponDate, FinancialInstrumentAttributes20.mmCouponDate, FinancialInstrumentAttributes35.mmCouponDate, FinancialInstrumentAttributes41.mmCouponDate,
					FinancialInstrumentAttributes4.mmCouponDate, FinancialInstrumentAttributes13.mmCouponDate, FinancialInstrumentAttributes21.mmCouponDate, FinancialInstrumentAttributes26.mmCouponDate,
					FinancialInstrumentAttributes36.mmCouponDate, FinancialInstrumentAttributes42.mmCouponDate, FinancialInstrumentAttributes27.mmCouponDate, FinancialInstrumentAttributes14.mmCouponDate,
					FinancialInstrumentAttributes30.mmCouponDate, FinancialInstrumentAttributes28.mmCouponDate, Debt1.mmNextCouponDate, FinancialInstrumentAttributes31.mmCouponDate, FinancialInstrumentAttributes44.mmCouponDate,
					FinancialInstrumentAttributes15.mmCouponDate, FinancialInstrumentAttributes29.mmCouponDate, Debt2.mmNextCouponDate, FinancialInstrumentAttributes2.mmCouponDate, FinancialInstrumentAttributes63.mmCouponDate,
					FinancialInstrumentAttributes64.mmCouponDate, FinancialInstrumentAttributes75.mmCouponDate, FinancialInstrumentAttributes78.mmCouponDate, Debt3.mmNextCouponDate, FinancialInstrumentAttributes91.mmCouponDate,
					FinancialInstrumentAttributes92.mmCouponDate, FinancialInstrumentAttributes95.mmCouponDate, FinancialInstrumentAttributes97.mmCouponDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CouponAttached obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(CouponAttached obj, ISODate value) {
			obj.setDate(value);
		}
	};
	protected Max3NumericText number;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmCouponAttachedNumber
	 * CommonFinancialInstrumentAttributes4.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes91.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes92.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmCouponNumber
	 * CorporateAction41.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmCouponNumber
	 * CorporateAction51.mmCouponNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes95.mmCouponAttachedNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes97.mmCouponAttachedNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached to the physical security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CouponAttached, Max3NumericText> mmNumber = new MMBusinessAttribute<CouponAttached, Max3NumericText>() {
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
					FinancialInstrumentAttributes78.mmCouponAttachedNumber, CommonFinancialInstrumentAttributes4.mmCouponAttachedNumber, FinancialInstrumentAttributes91.mmCouponAttachedNumber,
					FinancialInstrumentAttributes92.mmCouponAttachedNumber, CorporateAction41.mmCouponNumber, CorporateAction51.mmCouponNumber, FinancialInstrumentAttributes95.mmCouponAttachedNumber,
					FinancialInstrumentAttributes97.mmCouponAttachedNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Max3NumericText getValue(CouponAttached obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(CouponAttached obj, Max3NumericText value) {
			obj.setNumber(value);
		}
	};
	protected Security security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
	 * Security.mmCouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instrument to which a coupon is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CouponAttached, Security> mmSecurity = new MMBusinessAssociationEnd<CouponAttached, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Instrument to which a coupon is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmCouponAttached;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(CouponAttached obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(CouponAttached obj, Security value) {
			obj.setSecurity(value);
		}
	};
	protected ISODateTime couponClippingDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmCouponClippingDate
	 * CorporateActionDate4.mmCouponClippingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponClippingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the coupons are to be/were submitted for payment of interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CouponAttached, ISODateTime> mmCouponClippingDate = new MMBusinessAttribute<CouponAttached, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmCouponClippingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CouponClippingDate";
			definition = "Date on which the coupons are to be/were submitted for payment of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CouponAttached obj) {
			return obj.getCouponClippingDate();
		}

		@Override
		public void setValue(CouponAttached obj, ISODateTime value) {
			obj.setCouponClippingDate(value);
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the coupon."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CouponAttached, Max35Text> mmIdentification = new MMBusinessAttribute<CouponAttached, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the coupon.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CouponAttached obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CouponAttached obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CouponAttached";
				definition = "Physical certificates representing rights attached to the physical certificates representing a security.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmCouponAttached);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CouponAttached.mmDate, com.tools20022.repository.entity.CouponAttached.mmNumber, com.tools20022.repository.entity.CouponAttached.mmSecurity,
						com.tools20022.repository.entity.CouponAttached.mmCouponClippingDate, com.tools20022.repository.entity.CouponAttached.mmIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CouponAttached.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDate() {
		return date;
	}

	public CouponAttached setDate(ISODate date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public Max3NumericText getNumber() {
		return number;
	}

	public CouponAttached setNumber(Max3NumericText number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}

	public Security getSecurity() {
		return security;
	}

	public CouponAttached setSecurity(Security security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public ISODateTime getCouponClippingDate() {
		return couponClippingDate;
	}

	public CouponAttached setCouponClippingDate(ISODateTime couponClippingDate) {
		this.couponClippingDate = Objects.requireNonNull(couponClippingDate);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public CouponAttached setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}
}
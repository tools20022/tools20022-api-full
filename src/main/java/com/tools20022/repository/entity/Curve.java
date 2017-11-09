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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BenchmarkCurve1;
import com.tools20022.repository.msg.BenchmarkCurve2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Describes a benchmark curve.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Curve" src="doc-files/Curve.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve2
 * BenchmarkCurve2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve1
 * BenchmarkCurve1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
 * Spread.mmBenchmarkCurve}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmCurrency
 * Curve.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmName Curve.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmPoint Curve.mmPoint}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmSpread
 * Curve.mmSpread}</li>
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
 * "Curve"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes a benchmark curve."</li>
 * </ul>
 */
public class Curve {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode currency;
	/**
	 * Identifies the currency used for the benchmark curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkCurveCurrency
	 * BenchmarkCurve2.mmBenchmarkCurveCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmBenchmarkCurveCurrency
	 * BenchmarkCurve1.mmBenchmarkCurveCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the currency used for the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurve2.mmBenchmarkCurveCurrency, BenchmarkCurve1.mmBenchmarkCurveCurrency);
			elementContext_lazy = () -> Curve.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Identifies the currency used for the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected BenchmarkCurveNameCode name;
	/**
	 * Identifies the name of the benchmark curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName2Choice#mmCode
	 * BenchmarkCurveName2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName2Choice#mmProprietary
	 * BenchmarkCurveName2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkCurveName
	 * BenchmarkCurve2.mmBenchmarkCurveName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmBenchmarkCurveName
	 * BenchmarkCurve1.mmBenchmarkCurveName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InflationIndex1Choice#mmName
	 * InflationIndex1Choice.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmIndex
	 * BenchmarkCurveName4Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmName
	 * BenchmarkCurveName4Choice.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName5Choice#mmIndex
	 * BenchmarkCurveName5Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName5Choice#mmName
	 * BenchmarkCurveName5Choice.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmIndex
	 * BenchmarkCurveName6Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmName
	 * BenchmarkCurveName6Choice.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the name of the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurveName2Choice.mmCode, BenchmarkCurveName2Choice.mmProprietary, BenchmarkCurve2.mmBenchmarkCurveName, BenchmarkCurve1.mmBenchmarkCurveName, InflationIndex1Choice.mmName,
					BenchmarkCurveName4Choice.mmIndex, BenchmarkCurveName4Choice.mmName, BenchmarkCurveName5Choice.mmIndex, BenchmarkCurveName5Choice.mmName, BenchmarkCurveName6Choice.mmIndex, BenchmarkCurveName6Choice.mmName);
			elementContext_lazy = () -> Curve.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Identifies the name of the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BenchmarkCurveNameCode.mmObject();
		}
	};
	protected Max256Text point;
	/**
	 * Identifies a point on a benchmark curve. The point can be stated via a
	 * combination of maturity month/year and coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkCurvePoint
	 * BenchmarkCurve2.mmBenchmarkCurvePoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmBenchmarkCurvePoint
	 * BenchmarkCurve1.mmBenchmarkCurvePoint}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Point"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoint = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurve2.mmBenchmarkCurvePoint, BenchmarkCurve1.mmBenchmarkCurvePoint);
			elementContext_lazy = () -> Curve.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Point";
			definition = "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected Spread spread;
	/**
	 * Spread for which a benchmark curve is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
	 * Spread.mmBenchmarkCurve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmSpread
	 * BenchmarkCurve2.mmSpread}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmSpread
	 * BenchmarkCurve1.mmSpread}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread for which a benchmark curve is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurve2.mmSpread, BenchmarkCurve1.mmSpread);
			elementContext_lazy = () -> Curve.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread for which a benchmark curve is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmBenchmarkCurve;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Curve";
				definition = "Describes a benchmark curve.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Spread.mmBenchmarkCurve);
				element_lazy = () -> Arrays.asList(Curve.mmCurrency, Curve.mmName, Curve.mmPoint, Curve.mmSpread);
				derivationComponent_lazy = () -> Arrays.asList(BenchmarkCurve2.mmObject(), BenchmarkCurve1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public BenchmarkCurveNameCode getName() {
		return name;
	}

	public void setName(BenchmarkCurveNameCode name) {
		this.name = name;
	}

	public Max256Text getPoint() {
		return point;
	}

	public void setPoint(Max256Text point) {
		this.point = point;
	}

	public Spread getSpread() {
		return spread;
	}

	public void setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
	}
}
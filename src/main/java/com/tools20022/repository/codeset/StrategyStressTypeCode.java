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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.StrategyStressTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Scenario type based on the type of portfolio the scenario is designed to
 * stress.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StrategyStressTypeCode#Flex
 * StrategyStressTypeCode.Flex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StrategyStressTypeCode#Parallel
 * StrategyStressTypeCode.Parallel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StrategyStressTypeCode#Spread
 * StrategyStressTypeCode.Spread}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.StrategyStressType1Code
 * StrategyStressType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StrategyStressTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scenario type based on the type of portfolio the scenario is designed to stress."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StrategyStressTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Scenario, either by design or otherwise, that primarily tests the
	 * sensitivity of a portfolio of derivatives with a common underlying to
	 * differences in the valuation of such derivatives caused by differences in
	 * the maturity of such contracts. Typically, flex scenarios are aimed at
	 * stressing the valuation of portfolios that are insensitive to small
	 * movements in an underlying but sensitive to differences in the reaction
	 * of such portfolios in time space. For instance, calendar spreads or
	 * flattening or steeping positions in interest rate space.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StrategyStressTypeCode
	 * StrategyStressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLEX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Flex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scenario, either by design or otherwise, that primarily tests the sensitivity of a portfolio of derivatives with a common underlying to differences in the valuation of such derivatives caused by differences in the maturity of such contracts. Typically, flex scenarios are aimed at stressing the valuation of portfolios that are insensitive to small movements in an underlying but sensitive to differences in the reaction of such portfolios in time space. For instance, calendar spreads or flattening or steeping positions in interest rate space."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StrategyStressTypeCode Flex = new StrategyStressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Flex";
			definition = "Scenario, either by design or otherwise, that primarily tests the sensitivity of a portfolio of derivatives with a common underlying to differences in the valuation of such derivatives caused by differences in the maturity of such contracts. Typically, flex scenarios are aimed at stressing the valuation of portfolios that are insensitive to small movements in an underlying but sensitive to differences in the reaction of such portfolios in time space. For instance, calendar spreads or flattening or steeping positions in interest rate space.";
			owner_lazy = () -> com.tools20022.repository.codeset.StrategyStressTypeCode.mmObject();
			codeName = "FLEX";
		}
	};
	/**
	 * Scenario, either by design or otherwise, that primarily tests the
	 * sensitivity of a portfolio of derivatives to changes in the value of a
	 * common underlying. For example as parallel shift of an interest rate
	 * curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StrategyStressTypeCode
	 * StrategyStressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRLL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parallel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scenario, either by design or otherwise, that primarily tests the sensitivity of a portfolio of derivatives to changes in the value of a common underlying. For example as parallel shift of an interest rate curve."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StrategyStressTypeCode Parallel = new StrategyStressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parallel";
			definition = "Scenario, either by design or otherwise, that primarily tests the sensitivity of a portfolio of derivatives to changes in the value of a common underlying. For example as parallel shift of an interest rate curve.";
			owner_lazy = () -> com.tools20022.repository.codeset.StrategyStressTypeCode.mmObject();
			codeName = "PRLL";
		}
	};
	/**
	 * Scenario, either by design or otherwise, that primarily tests the
	 * sensitivity of a portfolio of derivatives with differing, but correlated
	 * underlyings. Typically, spread scenarios are aimed at stressing the
	 * valuation of portfolios that are insensitive to small co-movements in a
	 * set of underlyings but sensitive to differences in the reaction of such
	 * portfolios to breakdowns in historical correlations or covariance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StrategyStressTypeCode
	 * StrategyStressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scenario, either by design or otherwise, that primarily tests the sensitivity of a portfolio of derivatives with differing, but correlated underlyings. Typically, spread scenarios are aimed at stressing the valuation of portfolios that are insensitive to small co-movements in a set of underlyings but sensitive to differences in the reaction of such portfolios to breakdowns in historical correlations or covariance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StrategyStressTypeCode Spread = new StrategyStressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Scenario, either by design or otherwise, that primarily tests the sensitivity of a portfolio of derivatives with differing, but correlated underlyings. Typically, spread scenarios are aimed at stressing the valuation of portfolios that are insensitive to small co-movements in a set of underlyings but sensitive to differences in the reaction of such portfolios to breakdowns in historical correlations or covariance.";
			owner_lazy = () -> com.tools20022.repository.codeset.StrategyStressTypeCode.mmObject();
			codeName = "SPRD";
		}
	};
	final static private LinkedHashMap<String, StrategyStressTypeCode> codesByName = new LinkedHashMap<>();

	protected StrategyStressTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StrategyStressTypeCode";
				definition = "Scenario type based on the type of portfolio the scenario is designed to stress.";
				derivation_lazy = () -> Arrays.asList(StrategyStressType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StrategyStressTypeCode.Flex, com.tools20022.repository.codeset.StrategyStressTypeCode.Parallel,
						com.tools20022.repository.codeset.StrategyStressTypeCode.Spread);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Flex.getCodeName().get(), Flex);
		codesByName.put(Parallel.getCodeName().get(), Parallel);
		codesByName.put(Spread.getCodeName().get(), Spread);
	}

	public static StrategyStressTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StrategyStressTypeCode[] values() {
		StrategyStressTypeCode[] values = new StrategyStressTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StrategyStressTypeCode> {
		@Override
		public StrategyStressTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StrategyStressTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
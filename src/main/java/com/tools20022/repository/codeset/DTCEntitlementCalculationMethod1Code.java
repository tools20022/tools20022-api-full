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
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of calculation of entitlements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#StockRateFC15
 * DTCEntitlementCalculationMethod1Code.StockRateFC15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#CashRateFC17
 * DTCEntitlementCalculationMethod1Code.CashRateFC17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#StockRateFC18
 * DTCEntitlementCalculationMethod1Code.StockRateFC18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#StockRateXCashRateFC19
 * DTCEntitlementCalculationMethod1Code.StockRateXCashRateFC19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#StockRateEnableBuyUpToNextWholeShareFC20
 * DTCEntitlementCalculationMethod1Code.StockRateEnableBuyUpToNextWholeShareFC20
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#SharesXStock
 * DTCEntitlementCalculationMethod1Code.SharesXStock}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode
 * DTCEntitlementCalculationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCEntitlementCalculationMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of calculation of entitlements."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SR15"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCEntitlementCalculationMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateFC15"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethod1Code StockRateFC15 = new DTCEntitlementCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateFC15";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmObject();
			codeName = DTCEntitlementCalculationMethodCode.StockRateFC15.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateFC17"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethod1Code CashRateFC17 = new DTCEntitlementCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateFC17";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmObject();
			codeName = DTCEntitlementCalculationMethodCode.CashRateFC17.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateFC18"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethod1Code StockRateFC18 = new DTCEntitlementCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateFC18";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmObject();
			codeName = DTCEntitlementCalculationMethodCode.StockRateFC18.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateXCashRateFC19"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethod1Code StockRateXCashRateFC19 = new DTCEntitlementCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateXCashRateFC19";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmObject();
			codeName = DTCEntitlementCalculationMethodCode.StockRateXCashRateFC19.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateEnableBuyUpToNextWholeShareFC20"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethod1Code StockRateEnableBuyUpToNextWholeShareFC20 = new DTCEntitlementCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateEnableBuyUpToNextWholeShareFC20";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmObject();
			codeName = DTCEntitlementCalculationMethodCode.StockRateEnableBuyUpToNextWholeShareFC20.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesXStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethod1Code SharesXStock = new DTCEntitlementCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesXStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmObject();
			codeName = DTCEntitlementCalculationMethodCode.SharesXStock.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCEntitlementCalculationMethod1Code> codesByName = new LinkedHashMap<>();

	protected DTCEntitlementCalculationMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SR15");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCEntitlementCalculationMethod1Code";
				definition = "Specifies the type of calculation of entitlements.";
				trace_lazy = () -> DTCEntitlementCalculationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.StockRateFC15, com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.CashRateFC17,
						com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.StockRateFC18, com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.StockRateXCashRateFC19,
						com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.StockRateEnableBuyUpToNextWholeShareFC20, com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.SharesXStock);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StockRateFC15.getCodeName().get(), StockRateFC15);
		codesByName.put(CashRateFC17.getCodeName().get(), CashRateFC17);
		codesByName.put(StockRateFC18.getCodeName().get(), StockRateFC18);
		codesByName.put(StockRateXCashRateFC19.getCodeName().get(), StockRateXCashRateFC19);
		codesByName.put(StockRateEnableBuyUpToNextWholeShareFC20.getCodeName().get(), StockRateEnableBuyUpToNextWholeShareFC20);
		codesByName.put(SharesXStock.getCodeName().get(), SharesXStock);
	}

	public static DTCEntitlementCalculationMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCEntitlementCalculationMethod1Code[] values() {
		DTCEntitlementCalculationMethod1Code[] values = new DTCEntitlementCalculationMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCEntitlementCalculationMethod1Code> {
		@Override
		public DTCEntitlementCalculationMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCEntitlementCalculationMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
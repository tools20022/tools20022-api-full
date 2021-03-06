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
import com.tools20022.repository.codeset.YieldTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of yield at which the transaction was effected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeV2Code#CurrentYield
 * YieldTypeV2Code.CurrentYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeV2Code#YieldToMaturity
 * YieldTypeV2Code.YieldToMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeV2Code#YieldToCall
 * YieldTypeV2Code.YieldToCall}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "YieldTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of yield at which the transaction was effected."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CUYI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class YieldTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Annual income (interest or dividends) divided by the current price of the
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeV2Code
	 * YieldTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUYI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annual income (interest or dividends) divided by the current price of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final YieldTypeV2Code CurrentYield = new YieldTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "CurrentYield";
			definition = "Annual income (interest or dividends) divided by the current price of the security.";
			owner_lazy = () -> com.tools20022.repository.codeset.YieldTypeV2Code.mmObject();
			codeName = "CUYI";
		}
	};
	/**
	 * Internal rate of return an investor would achieve if he or she purchased
	 * that bond at its current dirty price, and held it to maturity, assuming
	 * all coupon and principal payments are received as scheduled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeV2Code
	 * YieldTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTMA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal rate of return an investor would achieve if he or she purchased that bond at its current dirty price, and held it to maturity, assuming all coupon and principal payments are received as scheduled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final YieldTypeV2Code YieldToMaturity = new YieldTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "YieldToMaturity";
			definition = "Internal rate of return an investor would achieve if he or she purchased that bond at its current dirty price, and held it to maturity, assuming all coupon and principal payments are received as scheduled.";
			owner_lazy = () -> com.tools20022.repository.codeset.YieldTypeV2Code.mmObject();
			codeName = "YTMA";
		}
	};
	/**
	 * Specifies the yield of a bond or note if you were to buy and hold the
	 * security until the call date. This yield is valid only if the security is
	 * called prior to maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeV2Code
	 * YieldTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTCA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the yield of a bond or note if you were to buy and hold the security until the call date. This yield is valid only if the security is called prior to maturity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final YieldTypeV2Code YieldToCall = new YieldTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "YieldToCall";
			definition = "Specifies the yield of a bond or note if you were to buy and hold the security until the call date. This yield is valid only if the security is called prior to maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.YieldTypeV2Code.mmObject();
			codeName = "YTCA";
		}
	};
	final static private LinkedHashMap<String, YieldTypeV2Code> codesByName = new LinkedHashMap<>();

	protected YieldTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CUYI");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "YieldTypeV2Code";
				definition = "Type of yield at which the transaction was effected.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.YieldTypeV2Code.CurrentYield, com.tools20022.repository.codeset.YieldTypeV2Code.YieldToMaturity,
						com.tools20022.repository.codeset.YieldTypeV2Code.YieldToCall);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CurrentYield.getCodeName().get(), CurrentYield);
		codesByName.put(YieldToMaturity.getCodeName().get(), YieldToMaturity);
		codesByName.put(YieldToCall.getCodeName().get(), YieldToCall);
	}

	public static YieldTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static YieldTypeV2Code[] values() {
		YieldTypeV2Code[] values = new YieldTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, YieldTypeV2Code> {
		@Override
		public YieldTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(YieldTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
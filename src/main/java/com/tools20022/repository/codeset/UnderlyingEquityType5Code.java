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
import com.tools20022.repository.codeset.UnderlyingEquityType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type for a contract for equity derivatives.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code#Other
 * UnderlyingEquityType5Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code#ExchangeTradedFund
 * UnderlyingEquityType5Code.ExchangeTradedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code#Share
 * UnderlyingEquityType5Code.Share}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code#StockDividend
 * UnderlyingEquityType5Code.StockDividend}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
 * UnderlyingTypeV3Code}</li>
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
 * "UnderlyingEquityType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type for a contract for equity derivatives."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnderlyingEquityType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code
	 * UnderlyingEquityType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType5Code Other = new UnderlyingEquityType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType5Code.mmObject();
			codeName = UnderlyingTypeV3Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code
	 * UnderlyingEquityType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFund"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType5Code ExchangeTradedFund = new UnderlyingEquityType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFund";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType5Code.mmObject();
			codeName = UnderlyingTypeV3Code.ExchangeTradedFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code
	 * UnderlyingEquityType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Share"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType5Code Share = new UnderlyingEquityType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Share";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType5Code.mmObject();
			codeName = UnderlyingTypeV3Code.Share.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code
	 * UnderlyingEquityType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType5Code StockDividend = new UnderlyingEquityType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType5Code.mmObject();
			codeName = UnderlyingTypeV3Code.StockDividend.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnderlyingEquityType5Code> codesByName = new LinkedHashMap<>();

	protected UnderlyingEquityType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingEquityType5Code";
				definition = "Specifies the type for a contract for equity derivatives.";
				trace_lazy = () -> UnderlyingTypeV3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingEquityType5Code.Other, com.tools20022.repository.codeset.UnderlyingEquityType5Code.ExchangeTradedFund,
						com.tools20022.repository.codeset.UnderlyingEquityType5Code.Share, com.tools20022.repository.codeset.UnderlyingEquityType5Code.StockDividend);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ExchangeTradedFund.getCodeName().get(), ExchangeTradedFund);
		codesByName.put(Share.getCodeName().get(), Share);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
	}

	public static UnderlyingEquityType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnderlyingEquityType5Code[] values() {
		UnderlyingEquityType5Code[] values = new UnderlyingEquityType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnderlyingEquityType5Code> {
		@Override
		public UnderlyingEquityType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnderlyingEquityType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
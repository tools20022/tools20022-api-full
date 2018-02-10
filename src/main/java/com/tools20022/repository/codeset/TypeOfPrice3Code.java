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
import com.tools20022.repository.codeset.TypeOfPrice3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of price and information about the price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code#Average
 * TypeOfPrice3Code.Average}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code#AverageOverride
 * TypeOfPrice3Code.AverageOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code#GrossOfAll
 * TypeOfPrice3Code.GrossOfAll}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code#Net
 * TypeOfPrice3Code.Net}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code#NetOfAll
 * TypeOfPrice3Code.NetOfAll}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code#ParValue
 * TypeOfPrice3Code.ParValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code#RoundedAverage
 * TypeOfPrice3Code.RoundedAverage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
 * TypeOfPriceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AVER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfPrice3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price and information about the price."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfPrice3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code
	 * TypeOfPrice3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Average"</li>
	 * </ul>
	 */
	public static final TypeOfPrice3Code Average = new TypeOfPrice3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Average";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice3Code.mmObject();
			codeName = TypeOfPriceCode.Average.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code
	 * TypeOfPrice3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageOverride"</li>
	 * </ul>
	 */
	public static final TypeOfPrice3Code AverageOverride = new TypeOfPrice3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageOverride";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice3Code.mmObject();
			codeName = TypeOfPriceCode.AverageOverride.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code
	 * TypeOfPrice3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossOfAll"</li>
	 * </ul>
	 */
	public static final TypeOfPrice3Code GrossOfAll = new TypeOfPrice3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossOfAll";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice3Code.mmObject();
			codeName = TypeOfPriceCode.GrossOfAll.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code
	 * TypeOfPrice3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Net"</li>
	 * </ul>
	 */
	public static final TypeOfPrice3Code Net = new TypeOfPrice3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Net";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice3Code.mmObject();
			codeName = TypeOfPriceCode.Net.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code
	 * TypeOfPrice3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetOfAll"</li>
	 * </ul>
	 */
	public static final TypeOfPrice3Code NetOfAll = new TypeOfPrice3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetOfAll";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice3Code.mmObject();
			codeName = TypeOfPriceCode.NetOfAll.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code
	 * TypeOfPrice3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParValue"</li>
	 * </ul>
	 */
	public static final TypeOfPrice3Code ParValue = new TypeOfPrice3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParValue";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice3Code.mmObject();
			codeName = TypeOfPriceCode.ParValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice3Code
	 * TypeOfPrice3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundedAverage"</li>
	 * </ul>
	 */
	public static final TypeOfPrice3Code RoundedAverage = new TypeOfPrice3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundedAverage";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice3Code.mmObject();
			codeName = TypeOfPriceCode.RoundedAverage.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfPrice3Code> codesByName = new LinkedHashMap<>();

	protected TypeOfPrice3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AVER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfPrice3Code";
				definition = "Specifies the type of price and information about the price.";
				trace_lazy = () -> TypeOfPriceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfPrice3Code.Average, com.tools20022.repository.codeset.TypeOfPrice3Code.AverageOverride, com.tools20022.repository.codeset.TypeOfPrice3Code.GrossOfAll,
						com.tools20022.repository.codeset.TypeOfPrice3Code.Net, com.tools20022.repository.codeset.TypeOfPrice3Code.NetOfAll, com.tools20022.repository.codeset.TypeOfPrice3Code.ParValue,
						com.tools20022.repository.codeset.TypeOfPrice3Code.RoundedAverage);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Average.getCodeName().get(), Average);
		codesByName.put(AverageOverride.getCodeName().get(), AverageOverride);
		codesByName.put(GrossOfAll.getCodeName().get(), GrossOfAll);
		codesByName.put(Net.getCodeName().get(), Net);
		codesByName.put(NetOfAll.getCodeName().get(), NetOfAll);
		codesByName.put(ParValue.getCodeName().get(), ParValue);
		codesByName.put(RoundedAverage.getCodeName().get(), RoundedAverage);
	}

	public static TypeOfPrice3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfPrice3Code[] values() {
		TypeOfPrice3Code[] values = new TypeOfPrice3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfPrice3Code> {
		@Override
		public TypeOfPrice3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfPrice3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
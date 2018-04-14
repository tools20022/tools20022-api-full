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
import com.tools20022.repository.codeset.TypeOfPrice1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#Average
 * TypeOfPrice1Code.Average}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#AverageOverride
 * TypeOfPrice1Code.AverageOverride}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#Combined
 * TypeOfPrice1Code.Combined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#GrossOfAll
 * TypeOfPrice1Code.GrossOfAll}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#Limit
 * TypeOfPrice1Code.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#Net
 * TypeOfPrice1Code.Net}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#NetDisclosed
 * TypeOfPrice1Code.NetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#NetOfAll
 * TypeOfPrice1Code.NetOfAll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#NetUndisclosed
 * TypeOfPrice1Code.NetUndisclosed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#NotionalGross
 * TypeOfPrice1Code.NotionalGross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#ParValue
 * TypeOfPrice1Code.ParValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#RoundedAverage
 * TypeOfPrice1Code.RoundedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code#Stop
 * TypeOfPrice1Code.Stop}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfPrice1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price and information about the price."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfPrice1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Average"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code Average = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Average";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.Average.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageOverride"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code AverageOverride = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageOverride";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.AverageOverride.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Combined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code Combined = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Combined";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.Combined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossOfAll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code GrossOfAll = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossOfAll";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.GrossOfAll.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code Limit = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.Limit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Net"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code Net = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Net";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.Net.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code NetDisclosed = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDisclosed";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.NetDisclosed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetOfAll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code NetOfAll = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetOfAll";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.NetOfAll.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetUndisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code NetUndisclosed = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetUndisclosed";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.NetUndisclosed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code NotionalGross = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalGross";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.NotionalGross.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code ParValue = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParValue";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.ParValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundedAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code RoundedAverage = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundedAverage";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.RoundedAverage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice1Code
	 * TypeOfPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stop"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfPrice1Code Stop = new TypeOfPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stop";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice1Code.mmObject();
			codeName = TypeOfPriceCode.Stop.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfPrice1Code> codesByName = new LinkedHashMap<>();

	protected TypeOfPrice1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AVER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfPrice1Code";
				definition = "Specifies the type of price and information about the price.";
				trace_lazy = () -> TypeOfPriceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfPrice1Code.Average, com.tools20022.repository.codeset.TypeOfPrice1Code.AverageOverride, com.tools20022.repository.codeset.TypeOfPrice1Code.Combined,
						com.tools20022.repository.codeset.TypeOfPrice1Code.GrossOfAll, com.tools20022.repository.codeset.TypeOfPrice1Code.Limit, com.tools20022.repository.codeset.TypeOfPrice1Code.Net,
						com.tools20022.repository.codeset.TypeOfPrice1Code.NetDisclosed, com.tools20022.repository.codeset.TypeOfPrice1Code.NetOfAll, com.tools20022.repository.codeset.TypeOfPrice1Code.NetUndisclosed,
						com.tools20022.repository.codeset.TypeOfPrice1Code.NotionalGross, com.tools20022.repository.codeset.TypeOfPrice1Code.ParValue, com.tools20022.repository.codeset.TypeOfPrice1Code.RoundedAverage,
						com.tools20022.repository.codeset.TypeOfPrice1Code.Stop);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Average.getCodeName().get(), Average);
		codesByName.put(AverageOverride.getCodeName().get(), AverageOverride);
		codesByName.put(Combined.getCodeName().get(), Combined);
		codesByName.put(GrossOfAll.getCodeName().get(), GrossOfAll);
		codesByName.put(Limit.getCodeName().get(), Limit);
		codesByName.put(Net.getCodeName().get(), Net);
		codesByName.put(NetDisclosed.getCodeName().get(), NetDisclosed);
		codesByName.put(NetOfAll.getCodeName().get(), NetOfAll);
		codesByName.put(NetUndisclosed.getCodeName().get(), NetUndisclosed);
		codesByName.put(NotionalGross.getCodeName().get(), NotionalGross);
		codesByName.put(ParValue.getCodeName().get(), ParValue);
		codesByName.put(RoundedAverage.getCodeName().get(), RoundedAverage);
		codesByName.put(Stop.getCodeName().get(), Stop);
	}

	public static TypeOfPrice1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfPrice1Code[] values() {
		TypeOfPrice1Code[] values = new TypeOfPrice1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfPrice1Code> {
		@Override
		public TypeOfPrice1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfPrice1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
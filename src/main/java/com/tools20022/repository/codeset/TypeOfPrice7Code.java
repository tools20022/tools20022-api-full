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
import com.tools20022.repository.codeset.TypeOfPrice7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Bid
 * TypeOfPrice7Code.Bid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Offer
 * TypeOfPrice7Code.Offer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#NetAssetValue
 * TypeOfPrice7Code.NetAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Creation
 * TypeOfPrice7Code.Creation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Cancellation
 * TypeOfPrice7Code.Cancellation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Interim
 * TypeOfPrice7Code.Interim}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Swing
 * TypeOfPrice7Code.Swing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Other
 * TypeOfPrice7Code.Other}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Mid
 * TypeOfPrice7Code.Mid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Reinvestment
 * TypeOfPrice7Code.Reinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Switch
 * TypeOfPrice7Code.Switch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#DailyDividendRate
 * TypeOfPrice7Code.DailyDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code#Actual
 * TypeOfPrice7Code.Actual}</li>
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
 * <li>"BIDE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfPrice7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfPrice7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bid"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Bid = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bid";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Bid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offer"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Offer = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offer";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Offer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValue"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code NetAssetValue = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAssetValue";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.NetAssetValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creation"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Creation = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creation";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Creation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Cancellation = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Cancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Interim = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Interim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swing"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Swing = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swing";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Swing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Other = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mid"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Mid = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mid";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Mid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Reinvestment = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Reinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Switch = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Switch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DailyDividendRate"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code DailyDividendRate = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DailyDividendRate";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.DailyDividendRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice7Code
	 * TypeOfPrice7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual"</li>
	 * </ul>
	 */
	public static final TypeOfPrice7Code Actual = new TypeOfPrice7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice7Code.mmObject();
			codeName = TypeOfPriceCode.Actual.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfPrice7Code> codesByName = new LinkedHashMap<>();

	protected TypeOfPrice7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BIDE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfPrice7Code";
				definition = "Specifies the type of price.";
				trace_lazy = () -> TypeOfPriceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfPrice7Code.Bid, com.tools20022.repository.codeset.TypeOfPrice7Code.Offer, com.tools20022.repository.codeset.TypeOfPrice7Code.NetAssetValue,
						com.tools20022.repository.codeset.TypeOfPrice7Code.Creation, com.tools20022.repository.codeset.TypeOfPrice7Code.Cancellation, com.tools20022.repository.codeset.TypeOfPrice7Code.Interim,
						com.tools20022.repository.codeset.TypeOfPrice7Code.Swing, com.tools20022.repository.codeset.TypeOfPrice7Code.Other, com.tools20022.repository.codeset.TypeOfPrice7Code.Mid,
						com.tools20022.repository.codeset.TypeOfPrice7Code.Reinvestment, com.tools20022.repository.codeset.TypeOfPrice7Code.Switch, com.tools20022.repository.codeset.TypeOfPrice7Code.DailyDividendRate,
						com.tools20022.repository.codeset.TypeOfPrice7Code.Actual);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bid.getCodeName().get(), Bid);
		codesByName.put(Offer.getCodeName().get(), Offer);
		codesByName.put(NetAssetValue.getCodeName().get(), NetAssetValue);
		codesByName.put(Creation.getCodeName().get(), Creation);
		codesByName.put(Cancellation.getCodeName().get(), Cancellation);
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Swing.getCodeName().get(), Swing);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Mid.getCodeName().get(), Mid);
		codesByName.put(Reinvestment.getCodeName().get(), Reinvestment);
		codesByName.put(Switch.getCodeName().get(), Switch);
		codesByName.put(DailyDividendRate.getCodeName().get(), DailyDividendRate);
		codesByName.put(Actual.getCodeName().get(), Actual);
	}

	public static TypeOfPrice7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfPrice7Code[] values() {
		TypeOfPrice7Code[] values = new TypeOfPrice7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfPrice7Code> {
		@Override
		public TypeOfPrice7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfPrice7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
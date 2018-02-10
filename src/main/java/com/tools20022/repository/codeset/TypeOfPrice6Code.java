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
import com.tools20022.repository.codeset.TypeOfPrice6Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Bid
 * TypeOfPrice6Code.Bid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Offer
 * TypeOfPrice6Code.Offer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#NetAssetValue
 * TypeOfPrice6Code.NetAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Creation
 * TypeOfPrice6Code.Creation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Cancellation
 * TypeOfPrice6Code.Cancellation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Interim
 * TypeOfPrice6Code.Interim}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Swing
 * TypeOfPrice6Code.Swing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Other
 * TypeOfPrice6Code.Other}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Mid
 * TypeOfPrice6Code.Mid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Reinvestment
 * TypeOfPrice6Code.Reinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Switch
 * TypeOfPrice6Code.Switch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#DailyDividendRate
 * TypeOfPrice6Code.DailyDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#Actual
 * TypeOfPrice6Code.Actual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code#NonAdjustedUnpublished
 * TypeOfPrice6Code.NonAdjustedUnpublished}</li>
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
 * "TypeOfPrice6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfPrice6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bid"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Bid = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bid";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Bid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offer"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Offer = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offer";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Offer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValue"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code NetAssetValue = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAssetValue";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.NetAssetValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creation"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Creation = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creation";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Creation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Cancellation = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Cancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Interim = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Interim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swing"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Swing = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swing";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Swing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Other = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mid"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Mid = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mid";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Mid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Reinvestment = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Reinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Switch = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Switch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DailyDividendRate"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code DailyDividendRate = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DailyDividendRate";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.DailyDividendRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code Actual = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.Actual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice6Code
	 * TypeOfPrice6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonAdjustedUnpublished"</li>
	 * </ul>
	 */
	public static final TypeOfPrice6Code NonAdjustedUnpublished = new TypeOfPrice6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonAdjustedUnpublished";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice6Code.mmObject();
			codeName = TypeOfPriceCode.NonAdjustedUnpublished.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfPrice6Code> codesByName = new LinkedHashMap<>();

	protected TypeOfPrice6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BIDE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfPrice6Code";
				definition = "Specifies the type of price.";
				trace_lazy = () -> TypeOfPriceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfPrice6Code.Bid, com.tools20022.repository.codeset.TypeOfPrice6Code.Offer, com.tools20022.repository.codeset.TypeOfPrice6Code.NetAssetValue,
						com.tools20022.repository.codeset.TypeOfPrice6Code.Creation, com.tools20022.repository.codeset.TypeOfPrice6Code.Cancellation, com.tools20022.repository.codeset.TypeOfPrice6Code.Interim,
						com.tools20022.repository.codeset.TypeOfPrice6Code.Swing, com.tools20022.repository.codeset.TypeOfPrice6Code.Other, com.tools20022.repository.codeset.TypeOfPrice6Code.Mid,
						com.tools20022.repository.codeset.TypeOfPrice6Code.Reinvestment, com.tools20022.repository.codeset.TypeOfPrice6Code.Switch, com.tools20022.repository.codeset.TypeOfPrice6Code.DailyDividendRate,
						com.tools20022.repository.codeset.TypeOfPrice6Code.Actual, com.tools20022.repository.codeset.TypeOfPrice6Code.NonAdjustedUnpublished);
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
		codesByName.put(NonAdjustedUnpublished.getCodeName().get(), NonAdjustedUnpublished);
	}

	public static TypeOfPrice6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfPrice6Code[] values() {
		TypeOfPrice6Code[] values = new TypeOfPrice6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfPrice6Code> {
		@Override
		public TypeOfPrice6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfPrice6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
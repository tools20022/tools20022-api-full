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
import com.tools20022.repository.codeset.TypeOfPrice11Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Bid
 * TypeOfPrice11Code.Bid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Offer
 * TypeOfPrice11Code.Offer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#NetAssetValue
 * TypeOfPrice11Code.NetAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Creation
 * TypeOfPrice11Code.Creation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Cancellation
 * TypeOfPrice11Code.Cancellation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Interim
 * TypeOfPrice11Code.Interim}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Swing
 * TypeOfPrice11Code.Swing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Mid
 * TypeOfPrice11Code.Mid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Reinvestment
 * TypeOfPrice11Code.Reinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Switch
 * TypeOfPrice11Code.Switch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Market
 * TypeOfPrice11Code.Market}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code#Indicative
 * TypeOfPrice11Code.Indicative}</li>
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
 * "TypeOfPrice11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price and information about the price."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfPrice11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bid"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Bid = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bid";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Bid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offer"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Offer = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offer";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Offer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValue"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code NetAssetValue = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAssetValue";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.NetAssetValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creation"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Creation = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creation";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Creation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Cancellation = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Cancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Interim = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Interim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swing"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Swing = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swing";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Swing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mid"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Mid = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mid";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Mid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Reinvestment = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Reinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Switch = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Switch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Market = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Market";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Market.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice11Code
	 * TypeOfPrice11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indicative"</li>
	 * </ul>
	 */
	public static final TypeOfPrice11Code Indicative = new TypeOfPrice11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indicative";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice11Code.mmObject();
			codeName = TypeOfPriceCode.Indicative.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfPrice11Code> codesByName = new LinkedHashMap<>();

	protected TypeOfPrice11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BIDE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfPrice11Code";
				definition = "Specifies the type of price and information about the price.";
				trace_lazy = () -> TypeOfPriceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfPrice11Code.Bid, com.tools20022.repository.codeset.TypeOfPrice11Code.Offer, com.tools20022.repository.codeset.TypeOfPrice11Code.NetAssetValue,
						com.tools20022.repository.codeset.TypeOfPrice11Code.Creation, com.tools20022.repository.codeset.TypeOfPrice11Code.Cancellation, com.tools20022.repository.codeset.TypeOfPrice11Code.Interim,
						com.tools20022.repository.codeset.TypeOfPrice11Code.Swing, com.tools20022.repository.codeset.TypeOfPrice11Code.Mid, com.tools20022.repository.codeset.TypeOfPrice11Code.Reinvestment,
						com.tools20022.repository.codeset.TypeOfPrice11Code.Switch, com.tools20022.repository.codeset.TypeOfPrice11Code.Market, com.tools20022.repository.codeset.TypeOfPrice11Code.Indicative);
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
		codesByName.put(Mid.getCodeName().get(), Mid);
		codesByName.put(Reinvestment.getCodeName().get(), Reinvestment);
		codesByName.put(Switch.getCodeName().get(), Switch);
		codesByName.put(Market.getCodeName().get(), Market);
		codesByName.put(Indicative.getCodeName().get(), Indicative);
	}

	public static TypeOfPrice11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfPrice11Code[] values() {
		TypeOfPrice11Code[] values = new TypeOfPrice11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfPrice11Code> {
		@Override
		public TypeOfPrice11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfPrice11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
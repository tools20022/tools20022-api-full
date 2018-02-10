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
import com.tools20022.repository.codeset.TypeOfPrice15Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice15Code#Bid
 * TypeOfPrice15Code.Bid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPrice15Code#Offer
 * TypeOfPrice15Code.Offer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice15Code#NetAssetValue
 * TypeOfPrice15Code.NetAssetValue}</li>
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
 * "TypeOfPrice15Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfPrice15Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice15Code
	 * TypeOfPrice15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bid"</li>
	 * </ul>
	 */
	public static final TypeOfPrice15Code Bid = new TypeOfPrice15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bid";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice15Code.mmObject();
			codeName = TypeOfPriceCode.Bid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice15Code
	 * TypeOfPrice15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offer"</li>
	 * </ul>
	 */
	public static final TypeOfPrice15Code Offer = new TypeOfPrice15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offer";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice15Code.mmObject();
			codeName = TypeOfPriceCode.Offer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice15Code
	 * TypeOfPrice15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValue"</li>
	 * </ul>
	 */
	public static final TypeOfPrice15Code NetAssetValue = new TypeOfPrice15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAssetValue";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPrice15Code.mmObject();
			codeName = TypeOfPriceCode.NetAssetValue.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfPrice15Code> codesByName = new LinkedHashMap<>();

	protected TypeOfPrice15Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BIDE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfPrice15Code";
				definition = "Specifies the type of price.";
				trace_lazy = () -> TypeOfPriceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfPrice15Code.Bid, com.tools20022.repository.codeset.TypeOfPrice15Code.Offer, com.tools20022.repository.codeset.TypeOfPrice15Code.NetAssetValue);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bid.getCodeName().get(), Bid);
		codesByName.put(Offer.getCodeName().get(), Offer);
		codesByName.put(NetAssetValue.getCodeName().get(), NetAssetValue);
	}

	public static TypeOfPrice15Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfPrice15Code[] values() {
		TypeOfPrice15Code[] values = new TypeOfPrice15Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfPrice15Code> {
		@Override
		public TypeOfPrice15Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfPrice15Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
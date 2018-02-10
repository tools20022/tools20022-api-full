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
import com.tools20022.repository.codeset.AssuredTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which type of party should be the assured on the insurance
 * certificate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AssuredTypeCode#Buyer
 * AssuredTypeCode.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssuredTypeCode#Seller
 * AssuredTypeCode.Seller}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssuredTypeCode#BuyerBank
 * AssuredTypeCode.BuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssuredTypeCode#SellerBank
 * AssuredTypeCode.SellerBank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AssuredType1Code
 * AssuredType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BUYE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssuredTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies which type of party should be the assured on the insurance certificate."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssuredTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The buyer should be the assured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssuredTypeCode
	 * AssuredTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The buyer should be the assured."</li>
	 * </ul>
	 */
	public static final AssuredTypeCode Buyer = new AssuredTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "The buyer should be the assured.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssuredTypeCode.mmObject();
			codeName = "BUYE";
		}
	};
	/**
	 * The seller should be the assured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssuredTypeCode
	 * AssuredTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The seller should be the assured."</li>
	 * </ul>
	 */
	public static final AssuredTypeCode Seller = new AssuredTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "The seller should be the assured.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssuredTypeCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * The buyer's bank should be the assured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssuredTypeCode
	 * AssuredTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The buyer's bank should be the assured."</li>
	 * </ul>
	 */
	public static final AssuredTypeCode BuyerBank = new AssuredTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "The buyer's bank should be the assured.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssuredTypeCode.mmObject();
			codeName = "BUBA";
		}
	};
	/**
	 * The seller's bank should be the assured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssuredTypeCode
	 * AssuredTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The seller's bank should be the assured."</li>
	 * </ul>
	 */
	public static final AssuredTypeCode SellerBank = new AssuredTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "The seller's bank should be the assured.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssuredTypeCode.mmObject();
			codeName = "SEBA";
		}
	};
	final static private LinkedHashMap<String, AssuredTypeCode> codesByName = new LinkedHashMap<>();

	protected AssuredTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BUYE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssuredTypeCode";
				definition = "Specifies which type of party should be the assured on the insurance certificate.";
				derivation_lazy = () -> Arrays.asList(AssuredType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssuredTypeCode.Buyer, com.tools20022.repository.codeset.AssuredTypeCode.Seller, com.tools20022.repository.codeset.AssuredTypeCode.BuyerBank,
						com.tools20022.repository.codeset.AssuredTypeCode.SellerBank);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Buyer.getCodeName().get(), Buyer);
		codesByName.put(Seller.getCodeName().get(), Seller);
		codesByName.put(BuyerBank.getCodeName().get(), BuyerBank);
		codesByName.put(SellerBank.getCodeName().get(), SellerBank);
	}

	public static AssuredTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssuredTypeCode[] values() {
		AssuredTypeCode[] values = new AssuredTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssuredTypeCode> {
		@Override
		public AssuredTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssuredTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
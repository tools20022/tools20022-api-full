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
import com.tools20022.repository.codeset.AssuredType1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.AssuredType1Code#Buyer
 * AssuredType1Code.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssuredType1Code#Seller
 * AssuredType1Code.Seller}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssuredType1Code#BuyerBank
 * AssuredType1Code.BuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssuredType1Code#SellerBank
 * AssuredType1Code.SellerBank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssuredTypeCode
 * AssuredTypeCode}</li>
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
 * "AssuredType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies which type of party should be the assured on the insurance certificate."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssuredType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssuredType1Code
	 * AssuredType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * </ul>
	 */
	public static final AssuredType1Code Buyer = new AssuredType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			owner_lazy = () -> com.tools20022.repository.codeset.AssuredType1Code.mmObject();
			codeName = AssuredTypeCode.Buyer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssuredType1Code
	 * AssuredType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * </ul>
	 */
	public static final AssuredType1Code Seller = new AssuredType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			owner_lazy = () -> com.tools20022.repository.codeset.AssuredType1Code.mmObject();
			codeName = AssuredTypeCode.Seller.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssuredType1Code
	 * AssuredType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBank"</li>
	 * </ul>
	 */
	public static final AssuredType1Code BuyerBank = new AssuredType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			owner_lazy = () -> com.tools20022.repository.codeset.AssuredType1Code.mmObject();
			codeName = AssuredTypeCode.BuyerBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssuredType1Code
	 * AssuredType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBank"</li>
	 * </ul>
	 */
	public static final AssuredType1Code SellerBank = new AssuredType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			owner_lazy = () -> com.tools20022.repository.codeset.AssuredType1Code.mmObject();
			codeName = AssuredTypeCode.SellerBank.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssuredType1Code> codesByName = new LinkedHashMap<>();

	protected AssuredType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BUYE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssuredType1Code";
				definition = "Specifies which type of party should be the assured on the insurance certificate.";
				trace_lazy = () -> AssuredTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssuredType1Code.Buyer, com.tools20022.repository.codeset.AssuredType1Code.Seller, com.tools20022.repository.codeset.AssuredType1Code.BuyerBank,
						com.tools20022.repository.codeset.AssuredType1Code.SellerBank);
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

	public static AssuredType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssuredType1Code[] values() {
		AssuredType1Code[] values = new AssuredType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssuredType1Code> {
		@Override
		public AssuredType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssuredType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
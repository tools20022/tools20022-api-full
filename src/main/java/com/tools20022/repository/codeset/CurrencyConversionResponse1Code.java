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
import com.tools20022.repository.codeset.CurrencyConversionResponse1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Result of a requested currency conversion.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#Allowed
 * CurrencyConversionResponse1Code.Allowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#Assumed
 * CurrencyConversionResponse1Code.Assumed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#InvalidCard
 * CurrencyConversionResponse1Code.InvalidCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#InvalidMerchant
 * CurrencyConversionResponse1Code.InvalidMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#InvalidProduct
 * CurrencyConversionResponse1Code.InvalidProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#NoRate
 * CurrencyConversionResponse1Code.NoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#NotAvailable
 * CurrencyConversionResponse1Code.NotAvailable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
 * CurrencyConversionResponseCode}</li>
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
 * "CurrencyConversionResponse1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of a requested currency conversion."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
 * CurrencyConversionResponse3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CurrencyConversionResponse1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allowed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#Allowed
	 * CurrencyConversionResponse3Code.Allowed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse1Code Allowed = new CurrencyConversionResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Allowed";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversionResponse3Code.Allowed);
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmObject();
			codeName = CurrencyConversionResponseCode.Allowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assumed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#Assumed
	 * CurrencyConversionResponse3Code.Assumed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse1Code Assumed = new CurrencyConversionResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assumed";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversionResponse3Code.Assumed);
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmObject();
			codeName = CurrencyConversionResponseCode.Assumed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#InvalidCard
	 * CurrencyConversionResponse3Code.InvalidCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse1Code InvalidCard = new CurrencyConversionResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCard";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversionResponse3Code.InvalidCard);
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMerchant"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#InvalidMerchant
	 * CurrencyConversionResponse3Code.InvalidMerchant}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse1Code InvalidMerchant = new CurrencyConversionResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMerchant";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversionResponse3Code.InvalidMerchant);
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidMerchant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidProduct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#InvalidProduct
	 * CurrencyConversionResponse3Code.InvalidProduct}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse1Code InvalidProduct = new CurrencyConversionResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidProduct";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversionResponse3Code.InvalidProduct);
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidProduct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#NoRate
	 * CurrencyConversionResponse3Code.NoRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse1Code NoRate = new CurrencyConversionResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRate";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversionResponse3Code.NoRate);
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmObject();
			codeName = CurrencyConversionResponseCode.NoRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#NotAvailable
	 * CurrencyConversionResponse3Code.NotAvailable}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse1Code NotAvailable = new CurrencyConversionResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversionResponse3Code.NotAvailable);
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmObject();
			codeName = CurrencyConversionResponseCode.NotAvailable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CurrencyConversionResponse1Code> codesByName = new LinkedHashMap<>();

	protected CurrencyConversionResponse1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversionResponse1Code";
				definition = "Result of a requested currency conversion.";
				nextVersions_lazy = () -> Arrays.asList(CurrencyConversionResponse3Code.mmObject());
				trace_lazy = () -> CurrencyConversionResponseCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse1Code.Allowed, com.tools20022.repository.codeset.CurrencyConversionResponse1Code.Assumed,
						com.tools20022.repository.codeset.CurrencyConversionResponse1Code.InvalidCard, com.tools20022.repository.codeset.CurrencyConversionResponse1Code.InvalidMerchant,
						com.tools20022.repository.codeset.CurrencyConversionResponse1Code.InvalidProduct, com.tools20022.repository.codeset.CurrencyConversionResponse1Code.NoRate,
						com.tools20022.repository.codeset.CurrencyConversionResponse1Code.NotAvailable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Allowed.getCodeName().get(), Allowed);
		codesByName.put(Assumed.getCodeName().get(), Assumed);
		codesByName.put(InvalidCard.getCodeName().get(), InvalidCard);
		codesByName.put(InvalidMerchant.getCodeName().get(), InvalidMerchant);
		codesByName.put(InvalidProduct.getCodeName().get(), InvalidProduct);
		codesByName.put(NoRate.getCodeName().get(), NoRate);
		codesByName.put(NotAvailable.getCodeName().get(), NotAvailable);
	}

	public static CurrencyConversionResponse1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CurrencyConversionResponse1Code[] values() {
		CurrencyConversionResponse1Code[] values = new CurrencyConversionResponse1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CurrencyConversionResponse1Code> {
		@Override
		public CurrencyConversionResponse1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CurrencyConversionResponse1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
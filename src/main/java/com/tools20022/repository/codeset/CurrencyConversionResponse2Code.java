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
import com.tools20022.repository.codeset.CurrencyConversionResponse2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code#Allowed
 * CurrencyConversionResponse2Code.Allowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code#InvalidCard
 * CurrencyConversionResponse2Code.InvalidCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code#InvalidProduct
 * CurrencyConversionResponse2Code.InvalidProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code#NoRate
 * CurrencyConversionResponse2Code.NoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code#NotAvailable
 * CurrencyConversionResponse2Code.NotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code#InvalidATMManager
 * CurrencyConversionResponse2Code.InvalidATMManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code#InvalidATM
 * CurrencyConversionResponse2Code.InvalidATM}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyConversionResponse2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of a requested currency conversion."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CurrencyConversionResponse2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code
	 * CurrencyConversionResponse2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse2Code Allowed = new CurrencyConversionResponse2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Allowed";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse2Code.mmObject();
			codeName = CurrencyConversionResponseCode.Allowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code
	 * CurrencyConversionResponse2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse2Code InvalidCard = new CurrencyConversionResponse2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCard";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse2Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code
	 * CurrencyConversionResponse2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse2Code InvalidProduct = new CurrencyConversionResponse2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse2Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidProduct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code
	 * CurrencyConversionResponse2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse2Code NoRate = new CurrencyConversionResponse2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRate";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse2Code.mmObject();
			codeName = CurrencyConversionResponseCode.NoRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code
	 * CurrencyConversionResponse2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse2Code NotAvailable = new CurrencyConversionResponse2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse2Code.mmObject();
			codeName = CurrencyConversionResponseCode.NotAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code
	 * CurrencyConversionResponse2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidATMManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse2Code InvalidATMManager = new CurrencyConversionResponse2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidATMManager";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse2Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidATMManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code
	 * CurrencyConversionResponse2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse2Code InvalidATM = new CurrencyConversionResponse2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidATM";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse2Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidATM.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CurrencyConversionResponse2Code> codesByName = new LinkedHashMap<>();

	protected CurrencyConversionResponse2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversionResponse2Code";
				definition = "Result of a requested currency conversion.";
				trace_lazy = () -> CurrencyConversionResponseCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse2Code.Allowed, com.tools20022.repository.codeset.CurrencyConversionResponse2Code.InvalidCard,
						com.tools20022.repository.codeset.CurrencyConversionResponse2Code.InvalidProduct, com.tools20022.repository.codeset.CurrencyConversionResponse2Code.NoRate,
						com.tools20022.repository.codeset.CurrencyConversionResponse2Code.NotAvailable, com.tools20022.repository.codeset.CurrencyConversionResponse2Code.InvalidATMManager,
						com.tools20022.repository.codeset.CurrencyConversionResponse2Code.InvalidATM);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Allowed.getCodeName().get(), Allowed);
		codesByName.put(InvalidCard.getCodeName().get(), InvalidCard);
		codesByName.put(InvalidProduct.getCodeName().get(), InvalidProduct);
		codesByName.put(NoRate.getCodeName().get(), NoRate);
		codesByName.put(NotAvailable.getCodeName().get(), NotAvailable);
		codesByName.put(InvalidATMManager.getCodeName().get(), InvalidATMManager);
		codesByName.put(InvalidATM.getCodeName().get(), InvalidATM);
	}

	public static CurrencyConversionResponse2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CurrencyConversionResponse2Code[] values() {
		CurrencyConversionResponse2Code[] values = new CurrencyConversionResponse2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CurrencyConversionResponse2Code> {
		@Override
		public CurrencyConversionResponse2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CurrencyConversionResponse2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
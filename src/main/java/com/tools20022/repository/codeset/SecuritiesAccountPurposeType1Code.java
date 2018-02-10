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
import com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the purpose of the securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code#Margin
 * SecuritiesAccountPurposeType1Code.Margin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code#ShortSale
 * SecuritiesAccountPurposeType1Code.ShortSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code#Abroad
 * SecuritiesAccountPurposeType1Code.Abroad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code#Centralised
 * SecuritiesAccountPurposeType1Code.Centralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code#CashDVP
 * SecuritiesAccountPurposeType1Code.CashDVP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code#Physical
 * SecuritiesAccountPurposeType1Code.Physical}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
 * SecuritiesAccountPurposeTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MARG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccountPurposeType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the purpose of the securities account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesAccountPurposeType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code
	 * SecuritiesAccountPurposeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Margin"</li>
	 * </ul>
	 */
	public static final SecuritiesAccountPurposeType1Code Margin = new SecuritiesAccountPurposeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.mmObject();
			codeName = SecuritiesAccountPurposeTypeCode.Margin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code
	 * SecuritiesAccountPurposeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSale"</li>
	 * </ul>
	 */
	public static final SecuritiesAccountPurposeType1Code ShortSale = new SecuritiesAccountPurposeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSale";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.mmObject();
			codeName = SecuritiesAccountPurposeTypeCode.ShortSale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code
	 * SecuritiesAccountPurposeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abroad"</li>
	 * </ul>
	 */
	public static final SecuritiesAccountPurposeType1Code Abroad = new SecuritiesAccountPurposeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Abroad";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.mmObject();
			codeName = SecuritiesAccountPurposeTypeCode.Abroad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code
	 * SecuritiesAccountPurposeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centralised"</li>
	 * </ul>
	 */
	public static final SecuritiesAccountPurposeType1Code Centralised = new SecuritiesAccountPurposeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centralised";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.mmObject();
			codeName = SecuritiesAccountPurposeTypeCode.Centralised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code
	 * SecuritiesAccountPurposeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDVP"</li>
	 * </ul>
	 */
	public static final SecuritiesAccountPurposeType1Code CashDVP = new SecuritiesAccountPurposeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDVP";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.mmObject();
			codeName = SecuritiesAccountPurposeTypeCode.CashDVP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code
	 * SecuritiesAccountPurposeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final SecuritiesAccountPurposeType1Code Physical = new SecuritiesAccountPurposeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.mmObject();
			codeName = SecuritiesAccountPurposeTypeCode.Physical.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesAccountPurposeType1Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesAccountPurposeType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MARG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccountPurposeType1Code";
				definition = "Specifies the purpose of the securities account.";
				trace_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.Margin, com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.ShortSale,
						com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.Abroad, com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.Centralised,
						com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.CashDVP, com.tools20022.repository.codeset.SecuritiesAccountPurposeType1Code.Physical);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Margin.getCodeName().get(), Margin);
		codesByName.put(ShortSale.getCodeName().get(), ShortSale);
		codesByName.put(Abroad.getCodeName().get(), Abroad);
		codesByName.put(Centralised.getCodeName().get(), Centralised);
		codesByName.put(CashDVP.getCodeName().get(), CashDVP);
		codesByName.put(Physical.getCodeName().get(), Physical);
	}

	public static SecuritiesAccountPurposeType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesAccountPurposeType1Code[] values() {
		SecuritiesAccountPurposeType1Code[] values = new SecuritiesAccountPurposeType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesAccountPurposeType1Code> {
		@Override
		public SecuritiesAccountPurposeType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesAccountPurposeType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
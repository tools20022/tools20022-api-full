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
import com.tools20022.repository.codeset.EUCapitalGain2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether capital gain is in the scope of the European directive on
 * taxation of savings income in the form of interest payments (Council
 * Directive 2003/48/EC 3 June) for an income realised upon sale, a refund or
 * redemption of shares and units etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUCapitalGain2Code#CapitalGainInScope
 * EUCapitalGain2Code.CapitalGainInScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUCapitalGain2Code#CapitalGainOutScope
 * EUCapitalGain2Code.CapitalGainOutScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUCapitalGain2Code#CapitalGainUnknown
 * EUCapitalGain2Code.CapitalGainUnknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode
 * EUCapitalGainCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EUSI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EUCapitalGain2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June) for an income realised upon sale, a refund or redemption of shares and units etc."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EUCapitalGain2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGain2Code
	 * EUCapitalGain2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainInScope"</li>
	 * </ul>
	 */
	public static final EUCapitalGain2Code CapitalGainInScope = new EUCapitalGain2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainInScope";
			owner_lazy = () -> com.tools20022.repository.codeset.EUCapitalGain2Code.mmObject();
			codeName = EUCapitalGainCode.CapitalGainInScope.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGain2Code
	 * EUCapitalGain2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainOutScope"</li>
	 * </ul>
	 */
	public static final EUCapitalGain2Code CapitalGainOutScope = new EUCapitalGain2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainOutScope";
			owner_lazy = () -> com.tools20022.repository.codeset.EUCapitalGain2Code.mmObject();
			codeName = EUCapitalGainCode.CapitalGainOutScope.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGain2Code
	 * EUCapitalGain2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainUnknown"</li>
	 * </ul>
	 */
	public static final EUCapitalGain2Code CapitalGainUnknown = new EUCapitalGain2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.EUCapitalGain2Code.mmObject();
			codeName = EUCapitalGainCode.CapitalGainUnknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EUCapitalGain2Code> codesByName = new LinkedHashMap<>();

	protected EUCapitalGain2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EUSI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EUCapitalGain2Code";
				definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June) for an income realised upon sale, a refund or redemption of shares and units etc.";
				trace_lazy = () -> EUCapitalGainCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUCapitalGain2Code.CapitalGainInScope, com.tools20022.repository.codeset.EUCapitalGain2Code.CapitalGainOutScope,
						com.tools20022.repository.codeset.EUCapitalGain2Code.CapitalGainUnknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CapitalGainInScope.getCodeName().get(), CapitalGainInScope);
		codesByName.put(CapitalGainOutScope.getCodeName().get(), CapitalGainOutScope);
		codesByName.put(CapitalGainUnknown.getCodeName().get(), CapitalGainUnknown);
	}

	public static EUCapitalGain2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EUCapitalGain2Code[] values() {
		EUCapitalGain2Code[] values = new EUCapitalGain2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EUCapitalGain2Code> {
		@Override
		public EUCapitalGain2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EUCapitalGain2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
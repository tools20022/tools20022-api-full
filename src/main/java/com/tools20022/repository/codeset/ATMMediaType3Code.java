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
import com.tools20022.repository.codeset.ATMMediaType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Category of media items.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code#Counterfeit
 * ATMMediaType3Code.Counterfeit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType3Code#Fit
 * ATMMediaType3Code.Fit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code#FitAndUnfit
 * ATMMediaType3Code.FitAndUnfit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType3Code#Suspect
 * ATMMediaType3Code.Suspect}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType3Code#Unfit
 * ATMMediaType3Code.Unfit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code#Unrecognised
 * ATMMediaType3Code.Unrecognised}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
 * ATMMediaTypeCode}</li>
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
 * "ATMMediaType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Category of media items."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMMediaType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
	 * ATMMediaType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterfeit"</li>
	 * </ul>
	 */
	public static final ATMMediaType3Code Counterfeit = new ATMMediaType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterfeit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType3Code.mmObject();
			codeName = ATMMediaTypeCode.Counterfeit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
	 * ATMMediaType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fit"</li>
	 * </ul>
	 */
	public static final ATMMediaType3Code Fit = new ATMMediaType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType3Code.mmObject();
			codeName = ATMMediaTypeCode.Fit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
	 * ATMMediaType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FitAndUnfit"</li>
	 * </ul>
	 */
	public static final ATMMediaType3Code FitAndUnfit = new ATMMediaType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FitAndUnfit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType3Code.mmObject();
			codeName = ATMMediaTypeCode.FitAndUnfit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
	 * ATMMediaType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspect"</li>
	 * </ul>
	 */
	public static final ATMMediaType3Code Suspect = new ATMMediaType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspect";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType3Code.mmObject();
			codeName = ATMMediaTypeCode.Suspect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
	 * ATMMediaType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfit"</li>
	 * </ul>
	 */
	public static final ATMMediaType3Code Unfit = new ATMMediaType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType3Code.mmObject();
			codeName = ATMMediaTypeCode.Unfit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
	 * ATMMediaType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unrecognised"</li>
	 * </ul>
	 */
	public static final ATMMediaType3Code Unrecognised = new ATMMediaType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unrecognised";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType3Code.mmObject();
			codeName = ATMMediaTypeCode.Unrecognised.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMMediaType3Code> codesByName = new LinkedHashMap<>();

	protected ATMMediaType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMMediaType3Code";
				definition = "Category of media items.";
				trace_lazy = () -> ATMMediaTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMMediaType3Code.Counterfeit, com.tools20022.repository.codeset.ATMMediaType3Code.Fit, com.tools20022.repository.codeset.ATMMediaType3Code.FitAndUnfit,
						com.tools20022.repository.codeset.ATMMediaType3Code.Suspect, com.tools20022.repository.codeset.ATMMediaType3Code.Unfit, com.tools20022.repository.codeset.ATMMediaType3Code.Unrecognised);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Counterfeit.getCodeName().get(), Counterfeit);
		codesByName.put(Fit.getCodeName().get(), Fit);
		codesByName.put(FitAndUnfit.getCodeName().get(), FitAndUnfit);
		codesByName.put(Suspect.getCodeName().get(), Suspect);
		codesByName.put(Unfit.getCodeName().get(), Unfit);
		codesByName.put(Unrecognised.getCodeName().get(), Unrecognised);
	}

	public static ATMMediaType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMMediaType3Code[] values() {
		ATMMediaType3Code[] values = new ATMMediaType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMMediaType3Code> {
		@Override
		public ATMMediaType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMMediaType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
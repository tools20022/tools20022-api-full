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
import com.tools20022.repository.codeset.CancellationProcessCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Configuration of the exchanges to perform the cancellation of a payment
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode#NotAllowed
 * CancellationProcessCode.NotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode#Advice
 * CancellationProcessCode.Advice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode#Request
 * CancellationProcessCode.Request}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CancellationProcess1Code
 * CancellationProcess1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationProcessCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Configuration of the exchanges to perform the cancellation of a payment transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NALW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancellationProcessCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card payment transaction cannot be cancelled by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode
	 * CancellationProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NALW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction cannot be cancelled by the acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final CancellationProcessCode NotAllowed = new CancellationProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowed";
			definition = "Card payment transaction cannot be cancelled by the acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessCode.mmObject();
			codeName = "NALW";
		}
	};
	/**
	 * Card payment transaction may be cancelled by an advice only before
	 * closure of the reconciliation period or before the capture by batch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode
	 * CancellationProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADVC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Advice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction may be cancelled by an advice only before closure of the reconciliation period or before the capture by batch."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final CancellationProcessCode Advice = new CancellationProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Advice";
			definition = "Card payment transaction may be cancelled by an advice only before closure of the reconciliation period or before the capture by batch.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessCode.mmObject();
			codeName = "ADVC";
		}
	};
	/**
	 * Card payment transaction may also be cancelled after the closure of the
	 * reconciliation period or after the capture by batch. In this case a
	 * cancellation request exchange is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode
	 * CancellationProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Request"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction may also be cancelled after the closure of the reconciliation period or after the capture by batch. In this case a cancellation request exchange is required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final CancellationProcessCode Request = new CancellationProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Request";
			definition = "Card payment transaction may also be cancelled after the closure of the reconciliation period or after the capture by batch. In this case a cancellation request exchange is required.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessCode.mmObject();
			codeName = "REQU";
		}
	};
	final static private LinkedHashMap<String, CancellationProcessCode> codesByName = new LinkedHashMap<>();

	protected CancellationProcessCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NALW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationProcessCode";
				definition = "Configuration of the exchanges to perform the cancellation of a payment transaction.";
				derivation_lazy = () -> Arrays.asList(CancellationProcess1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationProcessCode.NotAllowed, com.tools20022.repository.codeset.CancellationProcessCode.Advice,
						com.tools20022.repository.codeset.CancellationProcessCode.Request);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NotAllowed.getCodeName().get(), NotAllowed);
		codesByName.put(Advice.getCodeName().get(), Advice);
		codesByName.put(Request.getCodeName().get(), Request);
	}

	public static CancellationProcessCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancellationProcessCode[] values() {
		CancellationProcessCode[] values = new CancellationProcessCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancellationProcessCode> {
		@Override
		public CancellationProcessCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancellationProcessCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
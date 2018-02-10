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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TransferStatus4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the transfer or settlement instruction status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code#Accepted
 * TransferStatus4Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code#AlreadyExecuted
 * TransferStatus4Code.AlreadyExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code#Matched
 * TransferStatus4Code.Matched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code#Received
 * TransferStatus4Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code#SentToNextParty
 * TransferStatus4Code.SentToNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code#Settled
 * TransferStatus4Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code#Complete
 * TransferStatus4Code.Complete}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
 * TransferStatusCode}</li>
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
 * "TransferStatus4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the transfer or settlement instruction status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransferStatus4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code
	 * TransferStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//PACK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final TransferStatus4Code Accepted = new TransferStatus4Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatus4Code.mmObject();
			codeName = TransferStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code
	 * TransferStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//COSE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyExecuted"</li>
	 * </ul>
	 */
	public static final TransferStatus4Code AlreadyExecuted = new TransferStatus4Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//COSE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyExecuted";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatus4Code.mmObject();
			codeName = TransferStatusCode.AlreadyExecuted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code
	 * TransferStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::MTCH//MACH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * </ul>
	 */
	public static final TransferStatus4Code Matched = new TransferStatus4Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::MTCH//MACH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatus4Code.mmObject();
			codeName = TransferStatusCode.Matched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code
	 * TransferStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final TransferStatus4Code Received = new TransferStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatus4Code.mmObject();
			codeName = TransferStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code
	 * TransferStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * </ul>
	 */
	public static final TransferStatus4Code SentToNextParty = new TransferStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatus4Code.mmObject();
			codeName = TransferStatusCode.SentToNextParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code
	 * TransferStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final TransferStatus4Code Settled = new TransferStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatus4Code.mmObject();
			codeName = TransferStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatus4Code
	 * TransferStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * </ul>
	 */
	public static final TransferStatus4Code Complete = new TransferStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatus4Code.mmObject();
			codeName = TransferStatusCode.Complete.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransferStatus4Code> codesByName = new LinkedHashMap<>();

	protected TransferStatus4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferStatus4Code";
				definition = "Specifies the transfer or settlement instruction status.";
				trace_lazy = () -> TransferStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferStatus4Code.Accepted, com.tools20022.repository.codeset.TransferStatus4Code.AlreadyExecuted,
						com.tools20022.repository.codeset.TransferStatus4Code.Matched, com.tools20022.repository.codeset.TransferStatus4Code.Received, com.tools20022.repository.codeset.TransferStatus4Code.SentToNextParty,
						com.tools20022.repository.codeset.TransferStatus4Code.Settled, com.tools20022.repository.codeset.TransferStatus4Code.Complete);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(AlreadyExecuted.getCodeName().get(), AlreadyExecuted);
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(Complete.getCodeName().get(), Complete);
	}

	public static TransferStatus4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransferStatus4Code[] values() {
		TransferStatus4Code[] values = new TransferStatus4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransferStatus4Code> {
		@Override
		public TransferStatus4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransferStatus4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}